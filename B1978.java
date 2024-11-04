import java.util.Scanner;
public class B1978 {

    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();   
     int sum=n;
     for(int i=0;i<n;i++)
     {
        int a=sc.nextInt();
        boolean isSosu=true;
        if(a==1)
        sum--;
        for(int j=2;j<a-1;j++)
        {
            if(a%j==0&&a!=j&&isSosu==true)
            {
                
               
                sum--;
                isSosu=false;
            }
        }
     }
     System.out.printf("%d",sum);
     
    }
}