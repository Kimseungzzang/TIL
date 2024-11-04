import java.util.*;

public class B7569 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 가로 칸 수
        int N = sc.nextInt(); // 세로 칸 수
        int H = sc.nextInt(); // 상자의 층 수
        
        boolean allRipe = true;
        int dx[] = {1, -1, 0, 0, 0, 0};
        int dy[] = {0, 0, 1, -1, 0, 0};
        int dz[] = {0, 0, 0, 0, 1, -1};
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[H][N][M];
        int[][][] dis = new int[H][N][M];
        int[][][] tomato = new int[H][N][M];

        // 입력 처리
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    int input = sc.nextInt();
                    tomato[h][n][m] = input;
                    if (input == 1) {
                        queue.offer(new int[]{h, n, m});
                        visited[h][n][m] = true;
                    } else if (input == 0) {
                        allRipe = false;
                    }
                }
            }
        }

        // 모든 토마토가 익어있으면 0 출력
        if (allRipe) {
            System.out.println(0);
            return;
        }

        // BFS 탐색
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int z = cur[0]; // 층
            int y = cur[1]; // 세로
            int x = cur[2]; // 가로

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nz >= 0 && nz < H && ny >= 0 && ny < N && nx >= 0 && nx < M && !visited[nz][ny][nx]) {
                    if (tomato[nz][ny][nx] == 0) {
                        dis[nz][ny][nx] = dis[z][y][x] + 1;
                        visited[nz][ny][nx] = true;
                        queue.offer(new int[]{nz, ny, nx});
                    }
                }
            }
        }

        // 결과 확인
        int max = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (tomato[h][n][m] == 0 && dis[h][n][m] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, dis[h][n][m]);
                }
            }
        }

        // 최대 일수 출력
        System.out.println(max);
    }
}