import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int[][] RGB = new int [N+1][3];
        for(int i = 1; i < N+1; i++){
            st = new StringTokenizer(br.readLine());
            RGB[i][0] = Integer.parseInt(st.nextToken());
            RGB[i][1] = Integer.parseInt(st.nextToken());
            RGB[i][2] = Integer.parseInt(st.nextToken());
        }
        
        int[][] dp = new int [N+1][3];
        for(int i = 1; i < N+1; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + RGB[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + RGB[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + RGB[i][2];
        }
        
        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
        br.close();
    }
}