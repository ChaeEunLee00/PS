import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] room = new int[N];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int main = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        long cnt = 0;
        for(int i = 0; i < N; i++){
            // 총감독관
            room[i] -= main;
            cnt++;
            // 부감독관
            if(room[i] > 0) cnt += (room[i]-1)/sub+1;
        }

        System.out.println(cnt);
    }
}