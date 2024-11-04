import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class B11724 {
    static List<Integer>[] graph;
    static boolean visit[];
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        graph=new List[n+1];  
       
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
      
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        visit=new boolean[n+1];
        int connection=0;
        for(int i=1;i<=n;i++)
        {
            if(!visit[i])
            {
                dfs(i);
                connection++;
            }
        }
        System.out.println(connection);
    }

    public static void dfs(int node)
    {
        visit[node]=true;
        for(int neiborhood:graph[node])
        {
            if(!visit[neiborhood])
            dfs(neiborhood);
            
        }
    }
}
