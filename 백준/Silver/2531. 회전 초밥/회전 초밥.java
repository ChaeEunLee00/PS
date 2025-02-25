import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+k];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(i < k) arr[i+N] = arr[i];
        }

        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(c);
            for(int j = i; j < i+k; j++){
                set.add(arr[j]);
            }
            max = Math.max(max, set.size());
            set.clear();
        }

        System.out.println(max);
    }
}