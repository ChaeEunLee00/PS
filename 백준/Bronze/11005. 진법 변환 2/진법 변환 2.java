import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        String result = "";

        while(A/B != 0){
            long remainder = A % B;
            A = A / B;

            long temp = remainder + 48;
            if (temp > 57) temp = temp + 7;

            result = (char)temp + result;
        }

        long temp = A + 48;
        if (temp > 57) temp = temp + 7;

        result = (char)temp + result;

        System.out.println(result);
    }
}