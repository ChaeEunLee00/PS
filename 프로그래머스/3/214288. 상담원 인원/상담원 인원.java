import java.util.*;

class Solution {
    
    public class Mentee implements Comparable<Mentee>{
        int endtime, type;
        Mentee(int endtime, int type){
            this.endtime = endtime;
            this.type = type;
        }
        
        @Override
        public int compareTo(Mentee o){
            return this.endtime - o.endtime;
        }
    }
    
    public int solution(int k, int n, int[][] reqs) {
        
        // 각 유형 별 멘토 최소 한명
        int curN = k;
        int[] mentors = new int[k];
        for(int i = 0; i < k; i++){
            mentors[i] = 1;
        }
        
        // 기다리는 사람이 없을 때 까지 반복
        int i = 0;
        int time = 0;
        int waitingTime = 0;
        PriorityQueue<Mentee> ongoing = new PriorityQueue<>(); // 끝나는 시각, 멘토 - 오름차순 정렬
        while(i != reqs.length){
            // 상담이 끝났으면 상담원 반납하고 나가기
            if(!ongoing.isEmpty()){
                Mentee mentee = ongoing.peek();
                if(mentee.endtime == time){
                    mentors[mentee.type]++;
                    ongoing.poll();
                }
            }
                
            // 참여자 신청 시간이 되었을 때 혹은 넘었을 때
            int reqTime = reqs[i][0];
            int reqDura = reqs[i][1];
            int reqType = reqs[i][2]-1;
            if(time >= reqTime){
                System.out.println("i " + i + "time " + time + "reqTime " + reqTime);
                // 상담원이 있다면 상담시작
                if(mentors[reqType] != 0){
                    mentors[reqType]--;
                    ongoing.add(new Mentee(time+reqDura, reqType));
                    i++;
                    System.out.println(i-1);
                    System.out.println(mentors[reqType]+1);
                    System.out.println(waitingTime);
                } 
                // 상담원이 없다면
                else{
                    // 추가할 수 있으면 하거나 => 바로 추가하는 것이 좋은 방법일지?
                    if(curN < n){
                        curN++;
                        ongoing.add(new Mentee(time+reqDura, reqType));
                        i++;
                        System.out.println(i-1);
                        System.out.println(mentors[reqType]+1);
                        System.out.println(waitingTime);
                    }
                    // 없으면 웨이팅 시작
                    else{
                        waitingTime++;
                    }
                }
            }
            time++;
        }
        
        return waitingTime;
    }
}