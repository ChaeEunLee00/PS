import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        long B = sc.nextLong();

        long sum = 0;

        for(int i = 0; i < A.length(); i++){
            int temp = A.charAt(i) - 48;

            int num = temp; // 1~9
            if(num > 9) num = temp - 7;  // A~Z

            sum += num * Math.pow(B,A.length()-1-i);
        }

        System.out.println(sum);
    }
}