import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long num = 0;
        for(long i = 1; i <= n-2; i++){
            num += i*(i+1)/2;
        }

        System.out.println(num);
        System.out.println(3);
    }
}