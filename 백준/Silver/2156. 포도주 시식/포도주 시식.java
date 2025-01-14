import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] wine = new int[N+1];
        for(int i = 1; i < N+1; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }
        
        if(N == 1) System.out.println(wine[1]);
        else if(N == 2) System.out.println(wine[1] + wine[2]);
        else{
            int[] dp = new int[N+1];
            dp[1] = wine[1];
            dp[2] = wine[1] + wine[2];
            for(int i = 3; i < N+1; i++){
                dp[i] = Math.max(wine[i]+wine[i-1]+dp[i-3], Math.max(wine[i]+dp[i-2], dp[i-1]));
            }
            System.out.println(dp[N]);
        }
        br.close();
    }
}