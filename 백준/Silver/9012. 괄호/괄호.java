import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            int cnt = 0;
            String answer = "YES";
            for(int j = 0; j < line.length(); j++){
                if(line.charAt(j) == '(') cnt++;
                else if(cnt > 0) cnt--;
                else{
                    answer = "NO";
                    break;
                }
            }
            if(cnt > 0) answer = "NO";

            System.out.println(answer);
        }
    }
}