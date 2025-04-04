import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 코인 중복 제거, 정렬
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(br.readLine()));
        }

        int[] coins = new int[set.size()];
        int idx = 0;
        for(int coin : set){
            coins[idx++] = coin;
        }
        Arrays.sort(coins);

        // dp
        int min;
        int[] dp = new int[K+1];
        for(int i = 1; i <= K; i++){
            min = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++){
                if(i-coins[j] < 0 || dp[i-coins[j]] == -1) continue;
                min = Math.min(min, dp[i-coins[j]]);
            }
            if(min == Integer.MAX_VALUE) dp[i] = -1;
            else dp[i] = min+1;
        }

        System.out.println(dp[K]);
    }
}