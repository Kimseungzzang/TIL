import java.util.*;

public class B2468 {

    static int n;
    static int[] nx = {1, -1, 0, 0};
    static int[] ny = {0, 0, 1, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        int maxHeight = 0;

        // 지도 입력 및 최대 높이 파악
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        int maxSafeAreas = 0;

        // 가능한 모든 강우량에 대해 안전 영역 개수 계산
        for (int rainHeight = 0; rainHeight <= maxHeight; rainHeight++) {
            visited = new boolean[n][n];
            int safeAreas = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > rainHeight && !visited[i][j]) {
                        BFS(i, j, rainHeight);
                        safeAreas++;
                    }
                }
            }

            // 안전 영역 최대 개수 갱신
            maxSafeAreas = Math.max(maxSafeAreas, safeAreas);
        }

        System.out.println(maxSafeAreas);
    }

    // BFS를 통한 안전 영역 탐색
    public static void BFS(int i, int j, int height) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int a = 0; a < 4; a++) {
                int dx = x + nx[a];
                int dy = y + ny[a];
                if (dx >= 0 && dx < n && dy >= 0 && dy < n && !visited[dx][dy] && map[dx][dy] > height) {
                    queue.offer(new int[]{dx, dy});
                    visited[dx][dy] = true;
                }
            }
        }
    }
}