import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = A*B*C + "";

        int[] cnt = new int[10];
        for(int i = 0; i < result.length(); i++){
            cnt[result.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            sb.append(cnt[i]).append('\n');
        }

        System.out.println(sb);
    }
}