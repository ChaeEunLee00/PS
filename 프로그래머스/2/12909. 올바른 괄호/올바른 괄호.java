import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()){
                    answer = false;
                    break;
                }
                else{
                    stk.pop();
                }
            }
        }
        
        if(!stk.isEmpty()){
            answer = false;
        }

        return answer;
    }
}