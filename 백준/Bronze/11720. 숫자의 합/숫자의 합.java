import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //입력 
        int num = Integer.parseInt(sc.nextLine()); 
        String str = sc.nextLine();

        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += str.charAt(i) - 48; //48
        }

        System.out.println(sum);

    }
}