import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> countQ = new LinkedList<>();
        //100 까지 걸리는 일수 계산
        for(int i = 0; i < progresses.length; i++){
            int count = 0;
            while(progresses[i]  < 100){
                progresses[i] += speeds[i];
                count++;
            }
            countQ.add(count);
        }
        
        List<Integer> answer = new ArrayList<>();
        //처음 일수보다 크거나 작은 거 한꺼번에 배포 (카운트) 반복
        while(!countQ.isEmpty()){
            int deploy = countQ.remove();
            int cnt = 1;
            while(!countQ.isEmpty() && deploy >= countQ.peek()){
                countQ.remove();
                cnt++;
            }
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}