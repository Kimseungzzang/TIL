
import java.util.Scanner;
public class B11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 수의 개수
        int M = scanner.nextInt(); // 합을 구해야 하는 횟수

        int[] arr = new int[N + 1];
        int[] prefixSum = new int[N + 1];

        // 입력 받기
        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // 누적 합 계산
        }

        // 쿼리 처리
        for (int i = 0; i < M; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            // 구간 합 출력
            System.out.println(prefixSum[right] - prefixSum[left - 1]);
        }

        scanner.close();
    }
}