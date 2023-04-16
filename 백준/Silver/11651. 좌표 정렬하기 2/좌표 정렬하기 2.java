import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] coordinates = new int [num][2];
        for(int i = 0; i < num; i++){
            coordinates[i][0] = sc.nextInt();
            coordinates[i][1] = sc.nextInt();
        }
        Arrays.sort(coordinates, (o1, o2) -> {
            if(o1[1] == o2[1]) return o1[0] - o2[0];
            else return o1[1] - o2[1];
        });

        for(int i = 0; i < num; i++){
            System.out.println(coordinates[i][0] + " "+ coordinates[i][1]);
        }
    }
}