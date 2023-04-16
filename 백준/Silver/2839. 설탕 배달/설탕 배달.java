import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        int five = N / 5;
        for(int i = five; i >= 0; i--){

            int remainder = N - i * 5;
            if(remainder % 3 == 0){
                count = i + remainder / 3;
                break;
            }
            else count = -1;
        }

        System.out.println(count);
    }
}