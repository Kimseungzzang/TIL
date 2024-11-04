import java.util.Scanner;
public class B1259 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = -1; // 초기값은 -1로 설정 (루프 시작을 위해)
        
        while (true) {
            n = sc.nextInt(); // 입력을 받습니다.

            // 입력이 0일 경우 루프를 종료
            if (n == 0) {
                break;
            }
            
            String str=Integer.toString(n);
            StringBuilder sb=new StringBuilder(str);
         


  

            if(str.equals(sb.reverse().toString()))
            {
                System.out.println("yes");
            }
           else{
            System.out.println("no");
           } 
           
        }

      
    }
}