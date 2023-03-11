import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        int head = 0;
        int tail = str.length()-1;

        int isPalindrome = 1;
        while(head < tail){
            if (str.charAt(head) != str.charAt(tail)) {
                isPalindrome = 0;
                break;
            }
            head++;
            tail--;
        }
        System.out.println(isPalindrome);
    }
}