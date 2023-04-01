import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a1 = sc.nextDouble();
        double a0 = sc.nextDouble();
        double c = sc.nextDouble();
        double n0 = sc.nextDouble();

        if(c == a1){
            if(a0 <= 0) System.out.println(1);
            else System.out.println(0);
        }
        else{
            double num = a0/(c-a1);
            if(c-a1 < 0) System.out.println(0);
            else if(c-a1 > 0) {
                if (num <= n0) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}