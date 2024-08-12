import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        // 이중 for문 사용
        for(int i = 0; i < prices.length; i++){
            int count = 0;
            int targetPrice = prices[i];
            
            for(int j = i + 1; j < prices.length; j++){
                if (prices[j] >= targetPrice){
                    count++;
                }
                else {
                    count++;
                    break;
                }
            }
            answerList.add(count);    
        }
        
        // ArrayList를 array로 변환
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}