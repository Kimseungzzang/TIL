import java.util.Scanner;
public class B2798{
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=0;
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                     if(array[i]+array[j]+array[k]>max&&array[i]+array[j]+array[k]<=m){
                        max=array[i]+array[j]+array[k];
            
                     }
                    
                }
            }
        
        }
        System.out.printf("%d",max);


    }
}