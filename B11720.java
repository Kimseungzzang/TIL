import java.util.Scanner;

public class B11720 {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int sum=0;
            int t=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            for(int i=0;i<t;i++){
                char a=s.charAt(i);
                sum+=Character.getNumericValue(a);
            }

          
            
            System.out.println(sum);
            sc.close();

        }
}
