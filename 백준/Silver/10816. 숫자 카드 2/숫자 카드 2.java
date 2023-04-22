import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String,Integer> nums = new HashMap();
        for(int i = 0; i < N; i++){
            String num = st.nextToken();
            if(nums.containsKey(num)) {
                int count = nums.get(num);
                nums.replace(num, count +1);
            }
            else nums.put(num,1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String check = st2.nextToken();
            if(nums.containsKey(check)) sb.append(nums.get(check)).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}