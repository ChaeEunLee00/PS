import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // 해시맵에 의상의 종류와 의상의 수 넣기
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i = 0; i < clothes.length; i++){
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        //(의상의 수 + 1) * (의상의 수 + 1) * ... -1
        for (HashMap.Entry<String, Integer> entry : hm.entrySet()) {
            answer = answer * (entry.getValue() + 1);
        }
        
        return answer - 1;
    }
}