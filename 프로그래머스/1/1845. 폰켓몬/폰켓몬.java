import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {   
        int max = nums.length/2;
        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        if(set.size()<max) {
            return set.size();
        }
        return max;
    }
}