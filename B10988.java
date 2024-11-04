
import java.util.Scanner;
public class B10988 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r=new StringBuilder(s).reverse().toString();
        if (s.equals(r)) {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
    }
}
