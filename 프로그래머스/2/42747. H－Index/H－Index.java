import java.util.*;

class Solution {
    public int solution(int[] citations) {
        //오름차순 정렬 ex.[0,1,3,5,6]
        Arrays.sort(citations);
        
        int answer = 0;
        int total = citations.length;
        //for문, i, 범위는 총 논문수 ~ 1까지
        for(int i = total; i >= 0 ; i--){
            boolean isH = true;
            //1. i개의 논문이 i 이상인지
            for(int j = total -1; j >= total - i; j--){
                if(citations[j] < i) {
                    isH = false;
                    break;
                }
            }
            
            if(isH == false) continue;
            
            //2. 전체논문 - i 개의 논문이 i 이하인지 확인
            for(int j = total-i-1; j >=0; j-- ){
                if(citations[j] > i) isH = false;
                break;
            }
            
            //1,2 두 조건 모두 통과한다면 해당 숫자가 h
            if(isH == true) {
                answer = i;
                break;
            }
            
        }
        
        return answer;
    }
}