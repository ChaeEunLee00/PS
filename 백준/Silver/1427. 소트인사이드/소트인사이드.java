import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int[] nums = new int[input.length()];
        for(int i = 0; i < input.length(); i++){
            nums[i] = input.charAt(i) -'0';
        }

        Arrays.sort(nums);

        for(int i = input.length()-1 ; i >= 0; i--){
            System.out.print(nums[i]);
        }

    }
}