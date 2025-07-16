import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String quiz = br.readLine();

            int cnt = 0;
            int score = 0;
            for(int j = 0; j < quiz.length(); j++){
                if(quiz.charAt(j) == 'O') cnt++;
                else cnt = 0;
                score += cnt;
            }
            System.out.println(score);
        }
    }
}