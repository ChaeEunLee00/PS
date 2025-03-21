import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        
        Set<String> typeSet = new HashSet(Arrays.asList(gems));
        int type = typeSet.size();
        
        Set<String> set = new HashSet<>();
        Map<String,Integer> hm = new HashMap<>();
        
        int start = 0, end = 0;
        int min = Integer.MAX_VALUE;
        while(end < gems.length){
            hm.put(gems[end], hm.getOrDefault(gems[end],0)+1);
            set.add(gems[end]);
            
            if(set.size() == type){
                while(hm.get(gems[start])-1 > 0){
                    hm.put(gems[start],hm.get(gems[start])-1);
                    start++;
                }
                
                if(end-start < min){
                    min = end-start;
                    answer[0] = start+1;
                    answer[1] = end+1;
                }
                
                hm.put(gems[start],hm.get(gems[start])-1);
                set.remove(gems[start]);
                start++;
            }
            end++;
        }
        
        
        return answer;
    }
}