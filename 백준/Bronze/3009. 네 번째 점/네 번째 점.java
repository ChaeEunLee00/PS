import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> x_coordinates = new ArrayList<>();
        ArrayList<Integer> y_coordinates = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(!x_coordinates.contains(x)) x_coordinates.add(x);
            else x_coordinates.remove((Integer) x);

            if(!y_coordinates.contains(y)) y_coordinates.add(y);
            else y_coordinates.remove((Integer) y);
        }

        System.out.println(x_coordinates.get(0) + " " + y_coordinates.get(0));

    }
}