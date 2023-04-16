import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];

        int sum = 0;
        for(int i = 0; i < 5; i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.println(sum/5);

        Arrays.sort(score);
        System.out.println(score[2]);
    }
}