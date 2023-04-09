import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt()-1;

        long count = 0;
        while(num > count*6){
            num = num - count*6;
            count++;
        }

        System.out.println(count+1);
    }
}