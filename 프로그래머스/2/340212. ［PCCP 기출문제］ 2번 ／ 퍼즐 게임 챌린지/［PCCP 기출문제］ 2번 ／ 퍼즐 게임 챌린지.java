class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // 난이도 diff 최댓값
        int diffMax = 0;
        for(int diff: diffs){
            diffMax = Math.max(diffMax, diff);
        }

        // 이분탐색
        int left = 1;
        int right = diffMax;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            // 숙련도가 mid 일 때 걸리는 시간 계산
            long time = 0;
            for(int i = 0; i < diffs.length; i++){
                int diff = diffs[i] - mid;
                if(diff > 0){
                    if(i == 0){
                        time += times[i]*diff;
                    } else{
                        time += (times[i-1]+times[i])*diff;
                    }
                }
                time += times[i];
            }
            
            if(time > limit) left = mid+1;
            else right = mid-1;
        }
        
        return right+1;
    }
}