import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] sizes = new int[6];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++){
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i < 6; i++){
            cnt += (sizes[i] + T -1) / T;
        }
        sb.append(cnt).append('\n');
        sb.append(N/P).append(" ").append(N%P);

        System.out.println(sb);
    }
}