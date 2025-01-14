import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        if(N == number) return 1;      
        
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            dp.add(new HashSet<>());
        }
        
        int repeat = N;
        dp.get(1).add(N);
        for(int i = 2; i < 10; i++){
            
            for(int j = 1; j < i; j++){
                for(int a : dp.get(j)){
                    for(int b : dp.get(i-j)){
                        dp.get(i).add(a+b);
                        dp.get(i).add(a-b);
                        dp.get(i).add(a*b);
                        if(b != 0) dp.get(i).add(a/b);
                    }
                } 
            }
            repeat = repeat*10 + N;
            dp.get(i).add(repeat);
            if(dp.get(i).contains(number)) return i;
        }
        return -1;
    }
}