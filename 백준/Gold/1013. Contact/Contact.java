import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String signal = br.readLine();

            // 정규 표현식으로 패턴 비교
            if(signal.matches( "((100+1+)|01)+")) sb.append("YES");
            else sb.append("NO");
            sb.append('\n');
        }

        System.out.println(sb);
    }
}