import java.util.*;

public class B2667{

    static int[] nx={1,-1,0,0};
    static int[] ny={0,0,1,-1};
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static ArrayList<Integer> complexes = new ArrayList<>();
   
   
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    sc.nextLine();
    visited=new boolean[n][n];
    map=new int[n][n];
    for(int i=0;i<n;i++)
    { String line=sc.nextLine();
        for(int j=0;j<n;j++)
        {
            int input=line.charAt(j)-'0';
            map[i][j]=input;
        
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(map[i][j]==1&&!visited[i][j])
            {
                complexes.add(bfs(i,j));
            }
        }
    }
    System.out.println(complexes.size());
    Collections.sort(complexes);
    for(int complex:complexes)
    {
        System.out.println(complex);
    }
}
public static int bfs(int i,int j)
{
    Queue<int[]> queue=new LinkedList<>();
    queue.offer(new int[]{i,j});
    visited[i][j]=true;
    int count=1;
    while(!queue.isEmpty())
    {
        int[] cur=queue.poll();
        int x=cur[0];
        int y=cur[1];

        for(int k=0;k<4;k++)
        {
            int dx=x+nx[k];
            int dy=y+ny[k];
            if(dx>=0&&dx<n&&dy>=0&&dy<n&&!visited[dx][dy]&&map[dx][dy]==1)
            {
                
                queue.offer(new int[]{dx,dy});
                visited[dx][dy]=true;
                count++;
                
          
                

            }
        }
    }
    return count;

}
}