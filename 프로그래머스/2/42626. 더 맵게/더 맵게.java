import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 힙을 사용
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(int i = 0; i < scoville.length; i++){
            heap.add(scoville[i]);
        }
        // 가장 작은 것이 K 보다 작다면 음식 섞기 반복
        while(heap.peek() < K){
            int first = heap.poll();
            if(heap.peek() == null){
                answer = -1;
                break;
            }
            int second = heap.poll();
            int newFood = first + second * 2;
            heap.add(newFood);
            answer++;
        }
        
        if(heap.peek() == null) answer = -1;
        
        return answer;
    }
}