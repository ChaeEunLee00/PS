import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num != -1){
            //어레이리스트에 num을 제외한 약수 넣기
            ArrayList<Integer> divisors = new ArrayList<>();

            for(int i = 1; i < num; i++){
                if(num % i == 0) divisors.add(i);
            }

            //num을 제외한 모든 약수들의 합이 num과 같으면 완전수
            int sum = divisors.stream().mapToInt(n -> n).sum();
            if(sum == num){
                System.out.print(num + " = ");

                int size = divisors.size();
                for(int i = 0; i < size-1; i++){
                    System.out.print(divisors.get(i) + " + ");
                }

                System.out.println(divisors.get(size-1));
            }
            else{
                System.out.println(num + " is NOT perfect.");
            }

            num = sc.nextInt();
        }
    }
}