import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        Set<String> A = new HashSet<>();
        for(int i = 0; i < N; i++){
            A.add(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        Set<String> B = new HashSet<>();
        for(int i = 0; i < M; i++){
            String temp = st.nextToken();
            if(A.contains(temp)) A.remove(temp);
            else B.add(temp);
        }
        
        System.out.println(A.size()+B.size());
    }
}