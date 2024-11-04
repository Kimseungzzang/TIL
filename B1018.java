import java.util.*;

public class B1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행 수
        int m = sc.nextInt(); // 열 수
        sc.nextLine(); // 개행문자 처리

        char[][] chess = new char[n][m];

        // 체스판 입력 받기
        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < m; j++) {
                chess[i][j] = row.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;

        // 8x8 체스판을 전체 체스판에서 찾아내기
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                // (i, j) 좌표에서 8x8 체스판 검사 시작
                int changes1 = countChanges(chess, i, j, 'W');
               
                int changes2 = countChanges(chess, i, j, 'B');
              
                // 두 경우 중 작은 값 선택
                int currentMin = Math.min(changes1, changes2);
                minChanges = Math.min(minChanges, currentMin);
            }
        }

        System.out.println(minChanges);
    }

    // 체스판 패턴 변경 횟수 계산 함수
    private static int countChanges(char[][] board, int x, int y, char startColor) {
        int changes = 0;
        char currentColor = startColor;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != currentColor) {
                    changes++;
                }
                // 다음 칸의 색깔 바꾸기
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            // 다음 행은 현재 행의 첫 번째 칸의 색깔이 반대로 시작되어야 함
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }

        return changes;
    }
}