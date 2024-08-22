import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 작업이 끝나는 시간 기준으로 오름차순 힙 이용
        PriorityQueue<Array<int>> heap = new PriorityQueue<Array<int>>(new Comparator<Integer>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });
        
        for(int i = 0; i < jobs.length; i++){
            heap.add(jobs[i]);
        }
        
        int answer = 0;
        for(int i = 0; i < jobs.length; i++){
            int[] currentJob = heap.poll();
            if(answer < currentJob[0]){
                answer = currentJob[0]; 
            }
            answer += currentJob[1] - currentJob[0];
        }
        
        
        
        return answer/3;
    }
}