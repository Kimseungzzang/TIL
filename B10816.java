import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B10816 {
 public static void main(String[] args) throws IOException
 {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     int N = Integer.parseInt(br.readLine());

     // N개의 숫자 입력
     Map<Integer,Integer>countMap=new HashMap<>();
     StringTokenizer st = new StringTokenizer(br.readLine());
     for (int i = 0; i < N; i++) {
        int n=Integer.parseInt(st.nextToken());
         countMap.put(n,countMap.getOrDefault(n,0)+1);
     }

     // 두 번째 입력 (M)
     int M = Integer.parseInt(br.readLine());
     StringBuilder result=new StringBuilder();
     st=new StringTokenizer(br.readLine());
     for(int i=0;i<M;i++)
     {
        int n=Integer.parseInt(st.nextToken());
        result.append(countMap.getOrDefault(n,0)+" ");
     }
    System.out.print(result);
 }   
}
