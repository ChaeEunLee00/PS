import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String str = sc.nextLine();
        for(int i = 0; i < alphabet.length(); i++){
            System.out.print(str.indexOf(alphabet.charAt(i)) + " ");
        }
    }
}