import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.Arrays;
public class B1260 {
    static LinkedList<Integer> adj[];
    static boolean visit[];
    static Queue<Integer> queue;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int v=sc.nextInt();
        visit = new boolean[n+1];
        adj=new LinkedList[n+1];
        queue=new LinkedList<>();
        for(int i=1;i<n+1;i++)
        {
            adj[i]=new LinkedList<>();
        }
        for(int i=1;i<m;i++){
            int from=sc.nextInt();
            int to=sc.nextInt();
            adj[from].add(to);
            adj[to].add(from);
        }
        for(int i=0;i<n;i++)
        {
            Collections.sort(adj[i]);
        }
        Collections.sort(adj[v]);
        DFS(v,visit);
        Arrays.fill(visit,false);
        System.out.println();
        BFS(v,visit);
        
    }

    private static void DFS(int v,boolean visit[]){
            visit[v]=true;
            System.out.print(v+" ");
           
            Iterator<Integer> it=adj[v].listIterator();
            while(it.hasNext()){
                int n=it.next();
                if(!visit[n])
                    DFS(n, visit);

            }
    }

    private static void BFS(int v,boolean visit[]){
        visit[v]=true;
        queue.add(v);
        while(!queue.isEmpty())
        {   int s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> it=adj[s].listIterator();
            while(it.hasNext())
            {
                int n=it.next();
                if(!visit[n])
                {
                    queue.add(n);
                    visit[n]=true;
                }
            }
        }


    }
}
