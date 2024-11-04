import java.util.Scanner;
public class B2292{
    public static void main(String[]args ){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a=1;
        while(n>1)
        {
            n=n-a*6;
            a++;
            sum++;
        }
        System.out.printf("%d",sum+1);
    }

}