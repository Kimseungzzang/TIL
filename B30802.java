import java.util.Scanner;
public class B30802 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int T=sc.nextInt();
        int P=sc.nextInt();
        int sumT=6;
        int sumP=0;
      
            if(a/T>=0)
            {
            
                if(a%T==0)
                sumT+=a/T-1;
                else{
                sumT+=a/T;
                }
            }
            if(b/T>=0)
            {
               
                if(b%T==0)
                sumT+=b/T-1;
                else{
                sumT+=b/T;
                }
            }
            if(c/T>=0)
            {
         
             
                if(c%T==0)
                sumT+=c/T-1;
                else{
                sumT+=c/T;
                }
            }
            if(d/T>=0)
            {
              
                if(d%T==0)
                sumT+=d/T-1;
                else{
                sumT+=d/T;
                }
            }
            if(e/T>=0)
            {
              
                if(e%T==0)
                sumT+=e/T-1;
                else{
                sumT+=e/T;
                }
            }
            if(f/T>=0)
            {
                if(f%T==0)
                sumT+=f/T-1;
                else{
                sumT+=f/T;
                }
            }
        sumP=n/P;
        int oneP=n%P;

        System.out.printf("%d\n",sumT);
        System.out.printf("%d %d",sumP,oneP);

    }
    
}
