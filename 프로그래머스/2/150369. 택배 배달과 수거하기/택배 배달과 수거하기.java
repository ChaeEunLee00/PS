class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        int pos = n;
        int cnt;
        while(pos != 0){
            if(deliveries[pos-1] == 0 && pickups[pos-1] == 0){
                pos--;
                continue;
            }
            
            cnt = 0;
            int delivery = pos-1;
            while(cnt < cap){
                if(delivery < 0) break;
                if(deliveries[delivery] == 0){
                    delivery--;
                    continue;
                }
                deliveries[delivery]--;
                
                cnt++;
            }
            
            cnt = 0;
            int pickup = pos-1;
            while(cnt < cap){
                if(pickup < 0) break;
                if(pickups[pickup] == 0){
                    pickup--;
                    continue;
                }
                pickups[pickup]--;
                
                cnt++;
            }
            
            
            answer += pos*2;
        }
        
        return answer;
    }
}