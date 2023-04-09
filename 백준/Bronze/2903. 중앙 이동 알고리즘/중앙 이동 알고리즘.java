import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();

        long point = 2; //한변의 점의 갯수
        for(int i =0; i < num; i++){
            point = point + point-1;
        }
        System.out.println(point*point);
    }
}