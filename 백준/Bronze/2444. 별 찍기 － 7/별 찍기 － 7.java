import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1 ~ N
        for (int i = 1; i <= N; i++){
            //공백
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }

            //별
            for(int k = 0; k < i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();

        }

        // N-1 ~ 1
        for (int i = N-1; i >= 1; i--){
            //공백
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }

            //별
            for(int k = 0; k < i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}