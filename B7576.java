import java.util.*;

public class B7576 {
    static int[][] tomato;
    static int[][] dist; 
    static Queue <int[]>queue;
    static int[] nx={0,0,1,-1};
    static int[] ny={1,-1,0,0};

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
  
        tomato=new int[N][M];
        dist=new int[N][M];
        queue= new LinkedList<>();
        boolean visited[][]=new boolean[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                int status=sc.nextInt();
                if(status==1)
                {
                    queue.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
                tomato[i][j]=status;
               
            }
        }
        while(!queue.isEmpty())
        {
            int[] cur=queue.poll();
            int x=cur[0];
            int y=cur[1];
          
            for(int i=0;i<4;i++)
            {
                int dx=x+nx[i];
                int dy=y+ny[i];
                
                if(dx>=0&&dx<N&&dy>=0&&dy<M&&!visited[dx][dy])
                {
                 if(tomato[dx][dy]==0){
                    queue.offer(new int[]{dx,dy});
                    dist[dx][dy]=dist[x][y]+1;
                    visited[dx][dy]=true;
                 }
                 if(tomato[dx][dy]==-1)
                 {
                    
                    visited[dx][dy]=true;
                 }
                
                }
            }
        }
        int max = dist[0][0];
       
        // 배열 순회
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
   
              if(tomato[i][j] == 0 && dist[i][j] == 0)
              {
                System.out.println(-1);
                return;
              }
                if (dist[i][j] > max) {
                    max = dist[i][j];
                    
                }
            }
       
      
           
        }
        System.out.println(max);

    }
  
}
