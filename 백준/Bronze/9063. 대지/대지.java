import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) System.out.println(0);
        else {
            int x_init = sc.nextInt();
            int y_init = sc.nextInt();

            int x_max = x_init;
            int x_min = x_init;
            int y_max = y_init;
            int y_min = y_init;
            for (int i = 0; i < num-1; i++) {
                int x_temp = sc.nextInt();
                int y_temp = sc.nextInt();

                if(x_temp > x_max) x_max = x_temp;
                else if(x_temp < x_min) x_min = x_temp;

                if(y_temp > y_max) y_max = y_temp;
                else if(y_temp < y_min) y_min = y_temp;
            }

            int width = x_max - x_min;
            int height = y_max - y_min;
            System.out.println(width*height);
        }
    }
}