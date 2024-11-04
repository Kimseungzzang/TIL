import java.util.*;

public class B2579 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> step = new ArrayList<>();
        int[] dp = new int[n+1];
    
        // 계단 점수 입력
        for (int i = 0; i < n; i++) {
            step.add(sc.nextInt());
        }
        
        // DP 초기값 설정
        dp[1] = step.get(0);  // 첫 번째 계단

        if (n >= 2) {
            dp[2] = step.get(0) + step.get(1);  // 두 번째 계단
        }

        // DP 점화식
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + step.get(i-1), dp[i-3] + step.get(i-2) + step.get(i-1));
        }
     
        // 결과 출력
        System.out.println(dp[n]);
    }
}