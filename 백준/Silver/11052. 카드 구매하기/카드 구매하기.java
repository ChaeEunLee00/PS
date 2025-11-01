import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] cost = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] dp = new int[N+1];
        for(int i = 1; i < N+1; i++){
            dp[i] = cost[i-1];
            for(int j = 1; j < i/2+1; j++){
                dp[i] = Math.max(dp[i], dp[j]+dp[i-j]);
            }
        }
               
        System.out.println(dp[N]);
    }
}