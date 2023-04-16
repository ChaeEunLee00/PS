import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int num = 665;
        while(true){
            num++;
            if(Integer.toString(num).contains("666") ){
                count ++;
            }
            if(count == N){
                break;
            }
        }
        System.out.println(num);
    }
}