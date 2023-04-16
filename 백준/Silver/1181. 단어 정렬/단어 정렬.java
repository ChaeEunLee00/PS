import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] words = new String[num];
        for(int i = 0; i < num; i++){
            words[i] = sc.next();
        }

        Arrays.sort(words, (o1, o2) -> {
            if(o1.length() == o2.length()) return o1.compareTo(o2);
            else
                return o1.length() - o2.length();
        });

        for(int i = 0; i < num; i++){
            if(i == 0) System.out.println(words[0]);
            else if(!words[i-1].equals(words[i])) System.out.println(words[i]);
        }
    }
}