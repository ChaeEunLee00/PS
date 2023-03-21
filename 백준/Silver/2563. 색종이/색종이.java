import java.util.Scanner;

public class Main{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int[][] board = new int[100][100];

        int num = sc.nextInt();
        for(int i = 0; i < num; i++){

            int left = sc.nextInt();
            int bottom = sc.nextInt();

            for(int j= left; j < left+10; j++){
                for(int k = bottom; k < bottom+10; k++){
                    board[j][k] = 1;
                }
            }

        }

        int count = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(board[i][j] == 1) count++;
            }
        }
        System.out.println(count);
        
    }
}