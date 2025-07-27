import java.util.*;

class Solution {
    public String solution(long n, String[] bans) {
        String answer = ""; // a 97  z 122 26
        
        // bans에 있는 순서
        long[] banNums = new long[bans.length];
        for(int i = 0; i < bans.length; i++){
            String curBan = bans[i];
            int curBanLen = bans[i].length();
            for(int j = 0; j < curBanLen; j++){
                banNums[i] += (curBan.charAt(j) - 'a' + 1) * Math.pow(26, curBanLen-1-j);
            }
        }
        
        // bans 하지 않았을때 실제 n 찾기
        Arrays.sort(banNums);
        for(int i = 0; i < banNums.length; i++){
            if(banNums[i] <= n) n++;
            else break;
        }
        
        // 그걸로 알파벳 만들기
        long divider = n;
        StringBuilder sb = new StringBuilder();

        while (divider > 0) {
            long remainder = divider % 26;
    
            if (remainder == 0) {  // 26으로 나누어떨어지는 경우는 'z'
                sb.append('z');
                divider = divider / 26 - 1; // 몫에서 -1 해줘야 함!
            } else {
                sb.append((char)(remainder + 96)); // 1→a(97), 2→b ...
                divider /= 26;
            }
        }

        // 뒤집기
        sb.reverse();
        return sb.toString();
    }
}