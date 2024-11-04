import java.util.*;


public class B2667 {
    static int[][] map;
    static boolean visited[][];
    static Queue<int[]> queue;
    static int n;
    static List<Integer> list;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        queue=new LinkedList<>();
        list=new ArrayList<>();
         n= sc.nextInt();
         visited=new boolean[n][n];
         map=new int[n][n];
        for(int i=0;i<n;i++)
        {
            String line = sc.next();
            for (int j=0;j<n;j++)
            {
                int input= line.charAt(j) - '0';
                map[i][j]=input;
                if(input==1)
                {
                    queue.offer(new int[]{i,j});
                }
            }
        }
        bfs();
        Collections.sort(list);
        for(int a: list)
        {
            System.out.println(a);
        }


    }

    public static void bfs(){
        
     

        while(!queue.isEmpty())

        {
            int [] cur=queue.poll();
            int x=cur[0];
            int y=cur[1];
            visited[x][y]=true;
            int count=0;

            for(int i=0;i<4;i++)
            {
                int nx=x+dx[i];
                int ny=y+dy[i];

                if(nx>=0&&nx<n&&ny>=0&&ny<n&&!visited[nx][ny])
                {
                    if(map[nx][ny]==1)
                    {
                    queue.offer(new int[]{nx,ny});
                    visited[nx][ny]=true;
                    count++;
                    
                    }
                    else{
                        list.add(count);
                      
                    }
                }
            }
        }

    }

    
    
}
