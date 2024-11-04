import java.util.Scanner;

public class B1012 {
    
    static int[][] field;  // 배추밭을 저장할 배열
    static boolean[][] visited;  // 방문 여부를 확인할 배열
    static int M, N, K;  // 가로, 세로, 배추 위치 개수
    static int[] dx = {0, 0, -1, 1};  // 상하좌우 이동 좌표
    static int[] dy = {-1, 1, 0, 0};
    
    // DFS로 인접한 배추를 탐색
    public static void dfs(int x, int y) {
        visited[x][y] = true;  // 현재 위치 방문 처리
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 배추밭의 범위 내에 있고, 배추가 있으며 방문하지 않은 경우
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && field[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);  // 재귀적으로 인접한 배추 탐색
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // 테스트 케이스의 개수
        
        for (int t = 0; t < T; t++) {
            M = sc.nextInt();  // 배추밭의 가로 길이
            N = sc.nextInt();  // 배추밭의 세로 길이
            K = sc.nextInt();  // 배추가 심어져 있는 위치의 개수
            
            field = new int[M][N];
            visited = new boolean[M][N];
            
            // 배추의 위치 입력
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[x][y] = 1;
            }
            
            int wormCount = 0;  // 지렁이의 수
            
            // 배추밭을 순회하며 DFS로 군집 찾기
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);  // 새로운 군집 발견 시 DFS 수행
                        wormCount++;  // 지렁이 수 증가
                    }
                }
            }
            
            System.out.println(wormCount);  // 각 테스트 케이스마다 지렁이 수 출력
        }
        
        sc.close();
    }
}