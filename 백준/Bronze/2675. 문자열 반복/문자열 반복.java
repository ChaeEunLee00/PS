import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < num; i++){
            String line = sc.nextLine();
            int repeat = line.charAt(0) - 48;

            for(int j = 2; j < line.length(); j++){
                for(int k = 0; k < repeat; k++){
                    System.out.print(line.charAt(j));
                }
            }
            System.out.println();
        }
    }
}