import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new LinkedList<>();
        //hashtree에 장르의 총 횟수 저장 ex. classic 1450회
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0) + plays[i]);
        }
        
        // Entry List를 사용하여 정렬
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        
        
        //entryList에서 하나 씩 추출하며 반복문 (횟수가 많은 순으로 추출 될 것)
        for(Map.Entry<String, Integer> entry : entryList){
            // 해당 장르에 해당하는 고유번호와 재생횟수를 트리에 저장
            HashMap<Integer,Integer> map2 = new HashMap<Integer, Integer>();
            for(int i = 0; i < genres.length; i++){
                if(entry.getKey().equals(genres[i])){
                    map2.put(i,plays[i]);
                }
            }
            
            // 제일 많은 것 두개를 answer 배열에 추가 (하나라면 하나만 추가)
            List<Map.Entry<Integer, Integer>> entryList2 = new ArrayList<>(map2.entrySet());
            entryList2.sort((o1, o2) -> o2.getValue() - o1.getValue());  
                   
            answer.add(entryList2.get(0).getKey());
            if(entryList2.size() > 1){
                answer.add(entryList2.get(1).getKey());
            } 
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}