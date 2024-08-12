import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        // 대기하는 트럭의 큐 waiting을 생성
        Queue<Integer> waiting = new LinkedList<Integer>();
        for(int i = 0; i < truck_weights.length; i++){
            waiting.add(truck_weights[i]);
        }
        
        // 다리 건너는 트럭의 큐 going을 생성, 큐는 bridge_lenght를 유지하도록 함, 트럭이 없을 땐 0으로 채움
        Queue<Integer> going = new LinkedList<Integer>();
        for(int i = 0; i < bridge_length; i++){
            going.add(0);
        }
        
        // going 큐 안의 모든 합 추적
        int goingSum = 0;
        
        // waiting 큐 가 empty가 아닌 동안
        while(!waiting.isEmpty()){    
            // 우선, 트럭이 나가야하니까 going 큐에서 pop
            int r = going.remove();
            goingSum = goingSum - r;
            
            // 새로운 트럭이 들어올 수 있는지 확인하기 위한 sum
            int checkSum = goingSum + waiting.peek();
            
            // checkSum이 weight 이하면, waiting 큐에서 pop -> going 큐에서 push
            if (checkSum <= weight){
                // 1. waiting 큐에서 pop
                int a = waiting.remove();
                
                // 2. going 큐에 push
                going.add(a);
                goingSum = goingSum + a;
            }
            else{ // checkSum이 weight를 초과한다면, push 0
                going.add(0);
            }
            answer++;
        }
        
        // going 큐에 있는 기차들이 다 지나가는 시간도 계산
        while(!going.isEmpty()){
            going.remove();
            answer++;
        } 
        return answer;
    }
}