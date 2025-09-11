class Solution {
    public int n;
    public int m;
    public int r;
    public int c;
    public int k;
    public String answer;
    
    public int[] dx = {1, 0, 0, -1};
    public int[] dy = {0, -1, 1, 0};
    public char[] dc = {'d', 'l', 'r', 'u'};
    
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        this.n = n;
        this.m = m;
        this.r = r;
        this.c = c;
        this.k = k;
        this.answer = "";
        
        int dist = Math.abs(x-r) + Math.abs(y-c);
        if(k < dist) return "impossible";
        if(dist % 2 == 0 && k % 2 != 0) return "impossible";
        if(dist % 2 != 0 && k % 2 == 0) return "impossible";
        
        dfs(x, y, "");

        return answer;
    }
    
    public void dfs(int curX, int curY, String route){
        if(!answer.equals("")) return;
        
        if(route.length() == k){
            if(curX == r && curY == c) answer = route;
            return;
        }
        
        if(route.length() + Math.abs(curX-r) + Math.abs(curY-c) > k) return;
        
        for(int i = 0; i < 4; i++){
            int nextX = curX + dx[i];
            int nextY = curY + dy[i];
            
            if(nextX <= n && nextX > 0 && nextY <= m && nextY > 0){
                dfs(nextX, nextY, route + dc[i]);
            }
        }
    }
}