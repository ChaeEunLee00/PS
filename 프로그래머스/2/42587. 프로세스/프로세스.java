import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.add(i);
        }
        
        while(true){
            int num = q.peek();
            Boolean pass = true;
            for(int i = 0; i < priorities.length; i++){
                if(priorities[num] < priorities[i]){
                    q.remove();
                    q.add(num);
                    pass = false;
                    break;
                }
            }
            
            if(pass){
                q.remove();
                priorities[num] = 0;
                answer++;
                if(num == location){
                   break;
                }
            }
        }
        
        return answer;
    }
}