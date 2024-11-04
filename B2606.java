import java.util.*;
public class B2606 {
    static   boolean[] visited;
    static int infectedCount=0;
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       
      
        int n=sc.nextInt();
        int m=sc.nextInt();
        List <Integer>[] graph=new ArrayList[n+1];

        for(int i=1;i<n+1;i++)
        {
            graph[i]=new ArrayList<>();
        }

        for (int i=0;i<m;i++)
        {
           
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        visited=new boolean[n+1];


        dfs(1,graph);
        System.out.println(infectedCount-1);

    }
    static void dfs(int node,List<Integer>[] graph){
        visited[node]=true;
        infectedCount++;

        for(int neighbor:graph[node])
        {
            if(!visited[neighbor])
            {
                dfs(neighbor, graph);
            }
        }
    }
  
}
