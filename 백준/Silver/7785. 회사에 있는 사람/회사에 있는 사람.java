import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeSet<String> company = new TreeSet<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")) {
                company.add(name);
            }
            else {
                company.remove(name);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int companySize = company.size();
        for(int i = 0; i < companySize; i++){
            String temp = company.last();
            sb.append(temp+ '\n');
            company.remove(temp);
        }

        System.out.println(sb);
    }
}