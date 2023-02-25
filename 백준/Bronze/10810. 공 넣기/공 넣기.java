import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int basket = sc.nextInt();
        int M = sc.nextInt();

        //초기값 0인 바구니 배열 만들기
        int[] basketArray = new int[basket];

        for(int i = 0; i < M; i++){
            int from = sc.nextInt()-1;
            int to = sc.nextInt()-1;
            int ballNum = sc.nextInt();

            for (int j = from; j <= to; j++){
                basketArray[j] = ballNum;
            }
        }

        for(int i = 0; i < basket; i++){
            System.out.print(basketArray[i] + " ");
        }
    }
}