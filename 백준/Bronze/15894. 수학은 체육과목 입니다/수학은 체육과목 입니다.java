import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // 규칙이 있다 n -> n + n*3
        System.out.println(n + n*3);

    }
}