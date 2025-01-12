import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] schedule = new int[N+1][2];
        
        for(int i = 0; i < N; i++){
            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();
        }
        
        int max = 0;
        int[] update = new int[N+1];
        for(int i = 0; i < N+1; i++){
            if(update[i] > max) max = update[i];
            
            int next = i + schedule[i][0];
            int cost = schedule[i][1];
            if(next < N+1)
            update[next] = Math.max(update[next], max + cost);
        }
     
        System.out.println(max);
    }
}