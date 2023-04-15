import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int minConstructor = N;
        for(int i = 1; i < N; i++){
            String M = Integer.toString(i);

            int sum = i;
            for (int j = 0; j < M.length(); j++){
                sum += M.charAt(j) -'0';
            }

            if(sum == N){
                if(i < minConstructor) minConstructor = i;
            }
        }

        if( minConstructor == N) System.out.println(0);
        else System.out.println(minConstructor);
    }
}