import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int max = 0;
        int row = 1;
        int column = 1;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                int num = sc.nextInt();
                if(num>max){
                    max = num;
                    row = i;
                    column =j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}