import java.util.*;

class Solution {
    int n;
    ArrayList<ArrayList<Node>> nodes = new ArrayList<>();
    
    public class Node implements Comparable<Node>{
        int num, distance;
        
        Node(int num, int distance){
            this.num = num;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Node o){
            return this.distance - o.distance;
        }
    }
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 노드
        this.n = n;
        for(int i = 0; i <= n; i++){
            nodes.add(new ArrayList<>());
        }
        
        for(int i = 0; i < fares.length; i++){
            nodes.get(fares[i][0]).add(new Node(fares[i][1], fares[i][2]));
            nodes.get(fares[i][1]).add(new Node(fares[i][0], fares[i][2]));
        }
        
        // 다익스트라
        int[] startS = dijkstra(s);
        int[] startA = dijkstra(a);
        int[] startB = dijkstra(b);
        
        int answer = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            answer = Math.min(answer, startS[i]+startA[i]+startB[i]);
        }
        
        return answer;
    }
    
    // dijkstra
    public int[] dijkstra(int start){
        // dp 초기화
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[start] = 0;
        
        // 우선순위 큐 초기화
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start,dp[start]));
        
        while(!pq.isEmpty()){
            // 최소 거리 노드 방문
            Node cur = pq.poll();
            
            // 현재노드에서 방문할 수 있는 노드의 최소 거리 업데이트
            if(dp[cur.num] < cur.distance) continue;
            for(Node next : nodes.get(cur.num)){
                int newDist = dp[cur.num] + next.distance;
                if(newDist < dp[next.num]){
                    dp[next.num] = newDist;
                    pq.add(new Node(next.num, newDist));
                }
            }
        }
        
        return dp;
    }
}