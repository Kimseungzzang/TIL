import java.util.Scanner;

public class B9095 {
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        
       
        int[] dp=new int[11];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=10;i++)
        {
        dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(dp[sc.nextInt()]);
        }

    }
}
