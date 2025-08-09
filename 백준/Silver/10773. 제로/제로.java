import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                st.pop();
                continue;
            }
            st.push(num);
        }

        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        System.out.println(sum);
    }
}