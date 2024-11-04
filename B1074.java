import java.util.*;



public class B1074 {
    static int nx[]={1,-1,1};
    static int ny[]={0,1,1};
    static int sx=1;
    static int sy=1;
    static int[][]map;
    static int[][]dis;
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
       
        for(int i=0;i<N;i++)
        {
            sx*=2;
            sy*=2;
        }
        map=new int[sx][sy];
        dis=new int[sx][sy];

        bfs(map,dis);
        for(int i=0;i<sx;i++)
        {
            for(int j=0;j<sy;j++)
            {
                System.out.print(dis[i][j]);
            }
            System.out.println();
        }
        System.out.print(dis[r][c]);

    } 
    public static void bfs(int[][] map,int [][] dis)
    {
        boolean visited[][]=new boolean[sx][sy];
        Queue<int[]> queue=new LinkedList<>(); 
        queue.offer(new int[]{0,0} );
        while(!queue.isEmpty())
        {
            int cur[]=queue.poll();
            int x=cur[0];
            int y=cur[1];
            for(int i=0;i<3;i++)
            {
                int dx=x+nx[i];
                int dy=y+ny[i];
                if(dx>=0&&dx<sx&&dy>=0&&dy<sy&&!visited[dx][dy])
               {
                visited[dx][dy]=true;
                queue.offer(new int[]{dx,dy});
                dis[dx][dy]=dis[x][y]+1;
               }
            }



        }
    }
}
