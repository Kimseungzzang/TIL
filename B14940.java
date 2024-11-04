import java.util.*;
public class B14940 {
  
    static int n;
    static int m;
    static int a;
    static int b;
    static int [] dx={0,0,1,-1};
    static int [] dy={-1,1,0,0};
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int map[][]=new int[n][m];
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
                    
            
            for(int j=0;j<m;j++)
            {
                int key=sc.nextInt();
                 map[i][j]=key;
                 if(key==2)
                 {
                     a=i;
                     b=j;
                     dist[i][j]=0;
                 }
                 else if (key == 1) {  // 갈 수 있는 땅은 -1로 초기화
                    dist[i][j] = -1;
                } else {  // 갈 수 없는 땅(0)은 0으로 설정
                    dist[i][j] = 0;
                }

            }
        }
        bfs(map,dist);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(dist[i][j]+" "); 
            }
            System.out.println();
        }
    }

    public static void bfs(int[][] map,int[][] dist)
    {
        Queue<int[]> queue=new LinkedList<>();
        boolean visited[][]=new boolean[n][m];
        visited[a][b]=true;
        queue.offer(new int[]{a,b});
      
        while(!queue.isEmpty())
        {
            int cur[]=queue.poll();
            int x=cur[0];
            int y=cur[1];
         
            for(int i=0;i<4;i++)
            {
                int nx=x+dx[i];
                int ny=y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                    if (map[nx][ny] == 1) {  // 갈 수 있는 땅인 경우
                        dist[nx][ny] = dist[x][y] + 1;
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    } 
                }
            }
           
        }
    }
}
