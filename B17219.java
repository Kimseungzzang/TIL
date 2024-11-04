import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B17219 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String num[]=br.readLine().split(" ");

        int N=Integer.parseInt(num[0]);
        int M=Integer.parseInt(num[1]);

        Map<String,String> map=new HashMap<>();

        for(int i=0;i<N;i++)
        {
            String input[]=br.readLine().split(" ");
            map.put(input[0],input[1]);

        }
        for(int i=0;i<M;i++)
        {
            String site=br.readLine();
            System.out.println(map.get(site));
        }


    }
}
