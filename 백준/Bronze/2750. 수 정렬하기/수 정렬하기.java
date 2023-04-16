import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 1; j < N; j++){
                int a = nums[j-1];
                int b = nums[j];
                if (a > b){
                    nums[j-1] = b;
                    nums[j] = a;
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(nums[i]);
        }

    }
}