import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt()/4;
        
        String result = "int";
        for(int i = 0; i < num; i++){
            result = "long " + result;
        }
        System.out.println(result);
    }
}