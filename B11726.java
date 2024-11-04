import java.util.Scanner;

public class B11726 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1]; // n 크기의 배열 선언

        dp[1] = 1; // 2x1 크기를 채우는 방법은 1가지
        if(n >= 2) {
            dp[2] = 2; // 2x2 크기를 채우는 방법은 2가지
        }

        // 점화식을 이용한 DP 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[n]); // 결과 출력
    }
}
