import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        int[][] WV = new int[N+1][2];
        for(int i = 1; i < N+1; i++){
            st = new StringTokenizer(br.readLine());
            WV[i][0] = Integer.parseInt(st.nextToken());
            WV[i][1] = Integer.parseInt(st.nextToken());
        } 
        
        int[][] dp = new int[N+1][K+1];
        for(int i = 1; i < N+1; i++){
            for(int j = i; j < K+1; j++){
                if(WV[i][0] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(WV[i][1] + dp[i-1][j-WV[i][0]], dp[i-1][j]);
            }
        }
        
        System.out.println(dp[N][K]);
        br.close();
    }
}