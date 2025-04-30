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
    
    public void permutation(String ops){
        if(ops.length() == 3){
            answer = Math.max(answer,calculate(ops));
            return;
        }
        
        for(int i = 0; i < 3; i++){
            if(ops.contains(operators.charAt(i)+"")) continue;
            permutation(ops + operators.charAt(i));
        }
    }
    
    public long calculate(String ops){
        LinkedList<Character> operatorTemp = new LinkedList<>(operator);
        LinkedList<Long> operandTemp = new LinkedList<>(operand);
        
        for(int i = 0; i < 3; i++){
            char op = ops.charAt(i);
            for(int j = 0; j < operatorTemp.size(); j++){
                if(op == operatorTemp.get(j)){
                    operandTemp.set(j, cal(operandTemp.get(j),operandTemp.get(j+1), op));
                    operatorTemp.remove(j);
                    operandTemp.remove(j+1);
                    j--;
                }
            }
        }
        
        return Math.abs(operandTemp.get(0));
    }
    
    public long cal(long a, long b, char op){
        if(op == '+') return a+b;
        else if(op == '-') return a-b;
        else return a*b;
    }
                                    
                                    
}