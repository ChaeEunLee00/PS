import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> nums = new HashSet<>();
        for(int i = 0; i < N; i++){
            nums.add(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            if(nums.contains(st2.nextToken())) sb.append(1 + " ");
            else sb.append( 0 + " ");
        }

        System.out.println(sb);
    }
}