import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] remainders = new int[10];

        for (int i = 0; i < 10; i++){
            remainders[i] = sc.nextInt()%42;
        }
        
        int count = 1;
        for (int i = 1; i < 10; i++){
            boolean check  = true;
            for(int j = 0; j < i; j++){
                if(remainders[i] == remainders[j]) check = false;
            }
            if (check) count++;

        }
        System.out.println(count);
    }
}