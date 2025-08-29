import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        while(!num.equals("0")) {
            int len = num.length();

            boolean flag = true;
            for (int i = 0; i < len/2; i++) {
                if (num.charAt(i) != num.charAt(len-1-i)){
                    flag = false;
                    break;
                }
            }

            if(flag) System.out.println("yes");
            else System.out.println("no");

            num = br.readLine();
        }
    }
}