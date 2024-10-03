import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        
        
        // 정렬
        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));     
        
        if(strings[0].equals("0")){
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < strings.length; i++){
            answer.append(strings[i]);
        }
        
        return answer.toString();
    }
}