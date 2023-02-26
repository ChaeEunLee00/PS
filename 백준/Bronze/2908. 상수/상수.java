import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] str = line.split(" ");
        int[] num = new int[2];

        for(int i = 0; i < str.length; i++){
            int first = str[i].charAt(0) - 48;
            int second = str[i].charAt(1) - 48;
            int third = str[i].charAt(2) - 48;
            num[i] = first + second*10 + third*100;
        }

        if(num[0] >= num[1]) System.out.println(num[0]);
        else System.out.println(num[1]);
    }
}