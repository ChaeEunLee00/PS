import java.util.*;

public class Main{
    
    public static int N;
    public static int[][] chess;
    public static int answer = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        chess = new int[N][N];
        
        bt(0);

        System.out.println(answer);
        sc.close();
    }

    public static void bt(int currentR){
        if(currentR == N){
            answer++;
            return;
        } 
        
        for(int c = 0; c < N; c++){
            if(chess[currentR][c] == 0){
                afterVisit(currentR,c);
                bt(currentR+1);
                beforeVisit(currentR,c);
            }                
        }  
    }
    
    public static void afterVisit(int r, int c){
        for(int i = 0; i < N; i++){
            chess[r][i]++;
            chess[i][c]++;
            if(r+i < N && c+i < N) chess[r+i][c+i]++;
            if(r-i >= 0 && c-i >= 0) chess[r-i][c-i]++;
            if(r+i < N && c-i >=0) chess[r+i][c-i]++;
            if(r-i >= 0 && c+i < N) chess[r-i][c+i]++;
        }
    }
    
    public static void beforeVisit(int r, int c){
        for(int i = 0; i < N; i++){
            chess[r][i]--;
            chess[i][c]--;
            if(r+i < N && c+i < N) chess[r+i][c+i]--;
            if(r-i >= 0 && c-i >= 0) chess[r-i][c-i]--;
            if(r+i < N && c-i >=0) chess[r+i][c-i]--;
            if(r-i >= 0 && c+i < N) chess[r-i][c+i]--;
        }
    }
}