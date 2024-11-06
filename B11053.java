import java.util.Scanner;

public class B11053 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int maxLength = 0;
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(array[j]<array[i])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }
        System.out.println(maxLength);
    }
}
