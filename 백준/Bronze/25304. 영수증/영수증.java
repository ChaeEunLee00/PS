import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int totalPrice = sc.nextInt();
        int num = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i< num; i++){
            int price = sc.nextInt();
            int amount = sc.nextInt();
            sum += price * amount;
        }
        
        if(totalPrice == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}