import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] dp = new int[N];
        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(A[j] > A[i]){
                    if(dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]+1);
        br.close();
    }
}