import java.util.Scanner;

public class Main{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int sum = 0;
        for(int i = 0; i < line.length(); i++){
            char character = line.charAt(i); // A~B => 65~90
            int dial = 1;

            if(65 <= character && character <= 67) dial = 2;
            else if(68 <= character && character <= 70) dial = 3;
            else if(71 <= character && character <= 73) dial = 4;
            else if(74 <= character && character <= 76) dial = 5;
            else if(77 <= character && character <= 79) dial = 6;
            else if(80 <= character && character <= 83) dial = 7;
            else if(84 <= character && character <= 86) dial = 8;
            else if(87 <= character && character <= 90) dial = 9;

            int time = dial + 1;
            sum += time;
        }

        System.out.println(sum);
    }
}