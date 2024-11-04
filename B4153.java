import java.util.Scanner;
public class B4153 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=1;
        int b=1;
        int c=1;
        while(true)
        {
       
             a=sc.nextInt();
             b=sc.nextInt();
             c=sc.nextInt();

         
         if(a==0&&b==0&&c==0)
         break;
         if(test(a,b,c))
         {
        System.out.println("right");
         }
         else
        {
              System.out.println("wrong");
         }
}
    }
    public boolean test(int a,int b,int c)
    {
        int max=Math.max(a,Math.max(b,c));
        if (max == a) {
            return a * a == b * b + c * c;
        } else if (max == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }

    
}
