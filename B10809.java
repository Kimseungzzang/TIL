import java.util.Scanner;

public class B10809 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<26;i++)
        {
            int k=-1;
            for(int j=0;j<s.length();j++)
            {
            
                char c=s.charAt(j);
                if((int)c==(int)'a'+i)
                {
                    k=j;
                    break;
                }


            }

            if (k!=-1) {
                System.out.print(k+" ");
                
            }
            else{
                System.out.print(-1+" ");
            }

        }
    }
}
