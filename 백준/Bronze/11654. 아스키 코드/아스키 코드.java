import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //입력
        String input = sc.nextLine();
        char inputChar = input.charAt(0);

        System.out.println((int) inputChar);
    }
}