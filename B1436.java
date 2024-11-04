import java.util.Scanner;

public class B1436 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
        int n=sc.nextInt();
        
        int count=0;
        int start=666;
       while(true)
        {
            if(String.valueOf(start).contains("666"))
            {
                count++;
            }
            if(count==n)
            {
                System.out.println(start);
                break;
            }
            start++;

        }

    }
}
