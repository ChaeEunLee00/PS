import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] distances = new int[4];
        distances[0] = x;
        distances[1] = y;
        distances[2] = w - x;
        distances[3] = h - y;

        int min = distances[0];
        for(int distance : distances){
            if (distance < min) min = distance;
        }

        System.out.println(min);
    }
}