import java.util.Scanner;
public class B2475 {
    static public void main(String args[])
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            sum+=n*n;
        }
        System.out.printf("%d",(sum%10));
    }
}
