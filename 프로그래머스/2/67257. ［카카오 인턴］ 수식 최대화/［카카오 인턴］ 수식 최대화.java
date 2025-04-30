import java.util.*;

class Solution {
    
    ArrayList<Character> operator = new ArrayList<>();
    ArrayList<Long> operand = new ArrayList<>();
    
    public String operators = "+-*";
    public long answer = 0;
    
    public long solution(String expression) {
        int idx = 0;
        for(int i = 0; i < expression.length(); i++){
            if(operators.contains(expression.charAt(i)+"")){
                operator.add(expression.charAt(i));
                operand.add(Long.parseLong(expression.substring(idx, i)));
                idx = i+1;
            }
        }
        operand.add(Long.parseLong(expression.substring(idx)));
        
        permutation("");
        return answer;
    }
    
    public void permutation(String op){
        if(op.length() == 3){
            answer = Math.max(answer,calculate(op));
            return;
        }
        
        for(int i = 0; i < 3; i++){
            if(op.contains(operators.charAt(i)+"")) continue;
            permutation(op + operators.charAt(i));
        }
    }
    
    public long calculate(String op){
        LinkedList<Character> operatorTemp = new LinkedList<>(operator);
        LinkedList<Long> operandTemp = new LinkedList<>(operand);
        
        // System.out.println("op = " + op);
        
        for(int i = 0; i < 3; i++){
            if(op.charAt(i) == '+'){
                for(int j = 0; j < operatorTemp.size(); j++){
                    if(operatorTemp.get(j) == '+'){
                        
                        operandTemp.set(j, operandTemp.get(j)+operandTemp.get(j+1));
                        operatorTemp.remove(j);
                        operandTemp.remove(j+1);
                        j--;
                    }
                }
            }
            else if(op.charAt(i) == '-'){
                for(int j = 0; j < operatorTemp.size(); j++){
                    if(operatorTemp.get(j) == '-'){
                        
                        operandTemp.set(j, operandTemp.get(j)-operandTemp.get(j+1));
                        operatorTemp.remove(j);
                        operandTemp.remove(j+1);
                        j--;
                    }
                }
            }
            else if(op.charAt(i) == '*'){
                for(int j = 0; j < operatorTemp.size(); j++){
                    if(operatorTemp.get(j) == '*'){
                        
                        operandTemp.set(j, operandTemp.get(j)*operandTemp.get(j+1));
                        operatorTemp.remove(j);
                        operandTemp.remove(j+1);
                        j--;
                    }
                }
            }
//             for(int j = 0; j < operatorTemp.size(); j++){
//                 System.out.println(operatorTemp.get(j));
//             }
        
//             for(int j = 0; j < operandTemp.size(); j++){
//                 System.out.println(operandTemp.get(j));
//             }
        }
        
        return Math.abs(operandTemp.get(0));
    }
}