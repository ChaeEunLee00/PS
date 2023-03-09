import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        
        // A 배열
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        // B 배열
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                B[i][j] = sc.nextInt();
            }
        }
        
        //sum
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}