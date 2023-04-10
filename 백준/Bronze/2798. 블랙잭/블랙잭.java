import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] nums = new int[A];

        for(int i = 0; i < A; i++){
            nums[i] = sc.nextInt();
        }

        int maxSum = 0;
        for(int i = 0; i < A; i++){
            for(int j = i+1; j < A; j++) {
                for (int k = j + 1; k < A; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum <= B && sum > maxSum) maxSum = sum;
                }

            }
        }
        System.out.println(maxSum);
    }
}