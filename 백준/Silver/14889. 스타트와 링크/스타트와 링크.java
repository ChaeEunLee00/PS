import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] stats;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        stats = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                stats[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bt(0, 0, new boolean[N]);
        System.out.println(min);
    }

    public static void bt(int idx, int cnt, boolean[] visited){
        if(cnt == N/2){
            min = Math.min(min, getDiff(visited));
            return;
        }

        for(int i = idx; i < N; i++){
            visited[i] = true;
            bt(i+1, cnt+1, visited);
            visited[i] = false;
        }
    }

    public static int getDiff(boolean[] visited){
        int start = 0;
        for(int i = 0; i < N; i++){
            if(!visited[i]) continue;
            for(int j = i+1; j < N; j++){
                if(!visited[j]) continue;
                start += (stats[i][j] + stats[j][i]);
            }
        }

        int link = 0;
        for(int i = 0; i < N; i++){
            if(visited[i]) continue;
            for(int j = i+1; j < N; j++){
                if(visited[j]) continue;
                link += (stats[i][j] + stats[j][i]);
            }
        }

        return Math.abs(start-link);
    }
}