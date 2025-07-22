import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = 1;
        for(int i = N; i > N-M; i--){
            answer *= i;
        }

        for(int i = M; i > 1; i--){
            answer /= i;
        }

        System.out.println(answer);
    }
}