import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long T = sc.nextInt();

        for(int i =0; i < T; i++){
            long C = sc.nextInt();

            //쿼터
            System.out.print(C / 25 + " ");
            C = C % 25;

            //다임
            System.out.print(C / 10 + " ");
            C = C % 10;

            //니켈
            System.out.print(C / 5 + " ");
            C = C % 5;

            //페니
            System.out.print(C);
            System.out.println();
        }
    }
}