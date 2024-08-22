import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        // 힙을 사용(maxHeap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());

        // 힙을 사용(minHeap)
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        int count = 0;
        for(int i = 0; i < operations.length; i++){
            String current = operations[i];
            if(current.equals("D 1")){
                if(count > 0){
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                    count--;
                }
            }
            else if(current.equals("D -1")){
                if(count > 0){
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                    count--;
                }
            }
            else{
                int number = Integer.parseInt(current.split(" ")[1]);
                maxHeap.add(number);
                minHeap.add(number);
                count++;
            }
            
            if(count == 0){
                answer[0] = 0;
                answer[1] = 0;
            } else{
              answer[0] = maxHeap.peek();
              answer[1] = minHeap.peek();
            }
        }
        
        return answer;
    }
}