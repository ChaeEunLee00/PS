import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int from = sc.nextInt();
        int to = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = from; i <= to; i++){
            if(i == 1) continue;
            
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }

        if(primes.size() == 0) System.out.println(-1);
        else {
            int sum = primes.stream().mapToInt(n -> n).sum();
            int min = primes.get(0);
            System.out.println(sum);
            System.out.println(min);
        }
    }
}