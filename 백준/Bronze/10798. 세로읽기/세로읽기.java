import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        int maxLength = 0;
        for(int i = 0; i < 5; i ++){
            strings[i] = sc.nextLine();
            if(strings[i].length() > maxLength) maxLength = strings[i].length();
        }

        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < 5; j++){
                if(strings[j].length() > i) System.out.print(strings[j].charAt(i));
            }
        }
    }
}