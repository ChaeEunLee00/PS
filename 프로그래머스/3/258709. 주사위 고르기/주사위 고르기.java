import java.util.*;

class Solution {
    
    public int[][] dice;
        
    public int n;
    public int[] answer;
    public boolean[] diceAB;
    
    public int max = 0;
    
    public int[] solution(int[][] dice) {
        this.dice = dice;
        this.n = dice.length;
        this.answer = new int[n/2];
        this.diceAB = new boolean[n];
        
        comb(0, 0);
        
        return answer;
    }
    
    public void comb(int curIdx, int cnt){
        if(cnt == n/2) {
            // 해당 조합으로 A가 이기는 수
            int num = countAWin();
            
            // 최댓값 갱신
            if(max < num){
                max = num;
                
                int j = 0;
                for(int i = 0; i < n; i++){
                    if(diceAB[i]) answer[j++] = i+1;
                }
            }            
            return;
        }
        
        for(int i = curIdx; i < n; i++){
            diceAB[i] = true;
            comb(i+1, cnt+1);
            diceAB[i] = false;
        }
    }
    
    public int countAWin(){
        int cnt = 0;
        
        // A 주사위 모든 합의 경우의 수
        ArrayList<Integer> sumAList = new ArrayList<>();
        sumA(0,0,0,sumAList);
        
        // B 주사위 모든 합의 경우의 수
        ArrayList<Integer> sumBList = new ArrayList<>();
        sumB(0,0,0,sumBList);
        
        // 이진탐색
        Collections.sort(sumBList);
        for(int i = 0; i < sumAList.size(); i++){
            int target = sumAList.get(i);
            
            int left = 0, right = sumBList.size()-1;
            while(left <= right){
                int mid = (left + right) / 2;
                
                if(sumBList.get(mid) >= target) right = mid-1;
                else left = mid+1;
            }
            
            cnt += left;
        }
        
        return cnt;
    }
    
    public void sumA(int sum, int diceCnt, int curIdx, ArrayList<Integer> sumAList){
        if(diceCnt == n/2){
            sumAList.add(sum);
            return;
        }
        
        for(int i = curIdx; i < n; i++){
            if(diceAB[i]){
                for(int j = 0; j < 6; j++){
                    sumA(sum+dice[i][j], diceCnt+1, i+1, sumAList);
                }
            }
        }
    }
    
    public void sumB(int sum, int diceCnt, int curIdx, ArrayList<Integer> sumBList){
        if(diceCnt == n/2){
            sumBList.add(sum);
            return;
        }
        
        for(int i = curIdx; i < n; i++){
            if(!diceAB[i]){
                for(int j = 0; j < 6; j++){
                    sumB(sum+dice[i][j], diceCnt+1, i+1, sumBList);
                }
            }
        }
    }
}