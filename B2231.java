import java.util.Scanner;
public class B2231 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x = findX(n); // x 계산
        if (x != -1) {
            System.out.printf("%d",x);
        } else {
            System.out.println("0");
        }
    }
    public static int findX(int n) {
        // 1부터 n까지의 값을 시도하면서 x를 찾음
        for (int x = 1; x <= n; x++) {
            // x의 자릿수 합을 계산
            int sumOfDigits = getSumOfDigits(x);
            
            // n이 x + 자릿수 합과 같은지 확인
            if (n == x + sumOfDigits) {
                return x; // x 값을 반환
            }
        }
        return -1; // 해당하는 x가 없는 경우 -1 반환
    }
    
    // x의 자릿수 합을 계산하는 메서드
    private static int getSumOfDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10; // 마지막 자릿수 더하기
            x /= 10;       // 자릿수 줄이기
        }
        return sum;
    }

    
}
