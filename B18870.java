import java.util.Scanner;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
public class B18870 {

   static int N;
   static int K;

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         N=sc.nextInt();
         K=sc.nextInt();
       
        int result=BFS(N,K);

        System.out.println(result);
        
        
        
    }
    public static int BFS(int start,int end)
    {
      boolean visited[]=new boolean[100001];
      visited[start]=true;
      Queue <int[]>queue =new LinkedList<>();
      queue.offer(new int[]{start,0});
      
      while(!queue.isEmpty())
      {
        int[] current=queue.poll();
        int position=current[0];
        int time=current[1];

        if(position==end)
        {
            return time;
        }
        if(position-1>=0 && !visited[position-1])
        {
            visited[position-1]=true;
            queue.offer(new int[]{position-1,time+1});
           
        }
        if(position+1<=100000&&!visited[position+1])
        {
            visited[position+1]=true;
            queue.offer(new int[]{position+1,time+1});

        }
        if(position*2<=100000&&!visited[position*2])
        {
            visited[position*2]=true;
            queue.offer(new int[]{position*2,time+1});
        }

      }
      return -1;
        
    }
}
