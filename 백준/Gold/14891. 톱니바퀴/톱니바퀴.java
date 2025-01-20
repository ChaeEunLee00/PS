import java.io.*;
import java.util.*;

public class Main {
    public static int[][] gear = new int[4][8];
    public static int[] startIdx = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 톱니바퀴 상태 입력
        for (int i = 0; i < 4; i++) {
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                gear[i][j] = line.charAt(j) - '0'; // 숫자로 변환
            }
        }

        // 명령어 입력
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gearNum = Integer.parseInt(st.nextToken()) - 1; // 1-based -> 0-based
            int direction = Integer.parseInt(st.nextToken());
            rotate(gearNum, direction);
        }

        // 결과 계산
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            if (gear[i][startIdx[i]] == 1) {
                answer += Math.pow(2, i);
            }
        }
        System.out.println(answer);
    }

    public static void rotate(int gearNum, int direction) {
        boolean[] visited = new boolean[4];
        int[] rotations = new int[4]; // 각 톱니바퀴의 회전 방향 저장

        // BFS를 이용해 회전할 톱니바퀴 탐색
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { gearNum, direction });
        visited[gearNum] = true;
        rotations[gearNum] = direction;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int g = curr[0];
            int d = curr[1];

            // 왼쪽 톱니바퀴 검사
            if (g - 1 >= 0 && !visited[g - 1]) {
                if (gear[g - 1][(startIdx[g - 1] + 2) % 8] != gear[g][(startIdx[g] + 6) % 8]) {
                    queue.add(new int[] { g - 1, -d }); // 방향 반대
                    visited[g - 1] = true;
                    rotations[g - 1] = -d;
                }
            }

            // 오른쪽 톱니바퀴 검사
            if (g + 1 < 4 && !visited[g + 1]) {
                if (gear[g + 1][(startIdx[g + 1] + 6) % 8] != gear[g][(startIdx[g] + 2) % 8]) {
                    queue.add(new int[] { g + 1, -d }); // 방향 반대
                    visited[g + 1] = true;
                    rotations[g + 1] = -d;
                }
            }
        }

        // 모든 톱니바퀴 회전 수행
        for (int i = 0; i < 4; i++) {
            if (rotations[i] != 0) {
                startIdx[i] = (startIdx[i] - rotations[i] + 8) % 8; // 시계/반시계 회전
            }
        }
    }
}
