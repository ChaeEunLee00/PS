import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] bigBoard = new char[N][M];
        for(int i = 0; i < N; i++){
            String temp = sc.next();
            for(int j = 0; j < M; j++){
                bigBoard[i][j] = temp.charAt(j);
            }
        }

        int minCount = 64;
        for(int i = 0; i < N -7; i++){
            for(int j = 0; j < M-7; j++){

                int count = 0;
                char[][] board = new char[8][8];
                for(int k = 0; k < 8; k++){
                    for(int l = 0; l < 8; l++){
                        board[k][l] = bigBoard[i+k][j+l];
                    }
                }

                for(int x = 0; x < 8; x++){
                    if(x != 0 && board[x-1][0] == board[x][0]){
                        count++;
                        if (board[x-1][0] == 'B') board[x][0] = 'W';
                        else board[x][0] = 'B';
                    }
                    for(int y = 1; y < 8; y++){
                        if(board[x][y-1] == board[x][y]){
                            count++;

                            if(board[x][y-1] == 'B') board[x][y] = 'W';
                            else board[x][y] = 'B';
                        }
                    }
                }
                if(count < minCount) minCount = count;

                // ============ 앞 문자 바꿔서 테스트 B -> W, W -> B ============
                count = 0;
                char[][] board2 = new char[8][8];
                for(int k = 0; k < 8; k++){
                    for(int l = 0; l < 8; l++){
                        board2[k][l] = bigBoard[i+k][j+l];
                    }
                }
                if(board[0][0] == 'B') {
                    board2[0][0] = 'W';
                    count++;
                }
                else{
                    board2[0][0] = 'B';
                    count++;
                }
                for(int x = 0; x < 8; x++){
                    if(x != 0 && board2[x-1][0] == board2[x][0]){
                        count++;
                        if (board2[x-1][0] == 'B') board2[x][0] = 'W';
                        else board2[x][0] = 'B';
                    }
                    for(int y = 1; y < 8; y++){
                        if(board2[x][y-1] == board2[x][y]){
                            count++;
                            if(board2[x][y-1] == 'B') board2[x][y] = 'W';
                            else board2[x][y] = 'B';
                        }
                    }
                }
                if(count < minCount) minCount = count;
            }
        }


        System.out.print(minCount);
    }
}