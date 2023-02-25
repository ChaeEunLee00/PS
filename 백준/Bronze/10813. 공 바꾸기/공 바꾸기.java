import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int basket = sc.nextInt();
        int M = sc.nextInt();

        //초기값 0인 바구니 배열 만들기
        int[] basketArray = new int[basket];
        for(int i = 0; i < basket; i++){
            basketArray[i] = i + 1;
        }

        for(int i = 0; i < M; i++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;

            int temp = basketArray[A];
            basketArray[A] = basketArray[B];
            basketArray[B] = temp;
        }

        for(int i = 0; i < basket; i++){
            System.out.print(basketArray[i] + " ");
        }
    }
}