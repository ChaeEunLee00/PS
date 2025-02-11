import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
           trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);

        int start = 0;
        int end = trees[N-1];
        while(start < end - 1){
            int mid = (start+end) / 2;

            // 자른 나무 길이 구하기
            long totalLength = 0;
            for(int i = N-1; i >= 0; i--){
                if(trees[i] <= mid) break;
                totalLength += trees[i]-mid;
            }

            // 자른 나무 길이가 M 보다 크거나 같다면 start = mid
            // M보다 작다면 end = mid
            if(totalLength >= M) start = mid;
            else end = mid;
        }

        System.out.println(start);
    }
}