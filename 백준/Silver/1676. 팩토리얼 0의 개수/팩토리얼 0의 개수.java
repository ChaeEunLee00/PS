import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int twoNum = 0;
        int fiveNum = 0;
        for(int i = N; i >= 1; i--){
            int temp = i;
            while(temp % 2 == 0){
                twoNum++;
                temp /= 2;
            }

            while(temp % 5 == 0){
                fiveNum++;
                temp /= 5;
            }
        }

        System.out.println(twoNum > fiveNum ? fiveNum : twoNum);
    }
}