import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class B2908 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer t=new StringTokenizer(s," ");
        String first=t.nextToken();
        String last=t.nextToken();
        int a=Integer.parseInt(new StringBuilder(first).reverse().toString());
        int b=Integer.parseInt(new StringBuilder(last).reverse().toString());
        System.out.println(Math.max(a,b));
    }
}
