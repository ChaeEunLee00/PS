import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            int num = 0;
            if(operation.equals("add")){
                num = Integer.parseInt(st.nextToken());
                set.add(num);
            }
            else if(operation.equals("remove")){
                num = Integer.parseInt(st.nextToken());
                set.remove(num);
            }
            else if(operation.equals("check")){
                num = Integer.parseInt(st.nextToken());
                if(set.contains(num)) sb.append("1\n");
                else sb.append("0\n");
            }
            else if(operation.equals("toggle")){
                num = Integer.parseInt(st.nextToken());
                if(set.contains(num)) set.remove(num);
                else set.add(num);
            }
            else if(operation.equals("all")){
                for(int j = 1; j <= 20; j++){
                    set.add(j);
                }
            }
            else if(operation.equals("empty")){
                set.clear();
            }
        }

        System.out.println(sb);
    }
}