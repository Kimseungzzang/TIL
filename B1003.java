import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B1003 {
    static int[][] fibo=new int[41][2]; 
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        fibo[0][0]=1;
        fibo[0][1]=0;
        fibo[1][0]=0;
        fibo[1][1]=1;
        for(int i=2;i<=40;i++)
        {
            fibo[i][0]=fibo[i-1][0]+fibo[i-2][0];
            fibo[i][1]=fibo[i-1][1]+fibo[i-2][1];
        }
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
           
          bw.write(fibo[n][0]+" "+fibo[n][1]);
          bw.newLine();

        }
        bw.flush();
        bw.close();
    }
  
}
