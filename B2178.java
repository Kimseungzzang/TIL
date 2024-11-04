import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class B2178 {
    static int n;
    static int m;
    static int map[][];
    static boolean visited[][];
    static Queue<int[]> queue;
    static int []dx ={-1,1,0,0};
    static int []dy={0,0,-1,1};


    public static void main(String[] args){
        
    
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         m=sc.nextInt();
         sc.nextLine();
        map=new int[n][m];
        visited=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j)-'0'; 
            }
        }

        BFS(0,0);
        System.out.println(map[n-1][m-1]);
      
        
        
    }

    public static void BFS(int x,int y){
        
        
       
        queue=new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y]=true;
        while (!queue.isEmpty()) {
            int []current=queue.poll();
            int curX = current[0];
            int curY = current[1];
            for(int i=0;i<4;i++){
                x=dx[i]+curX;
                y=dy[i]+curY;
            
                if(x>=0&&x<n&&y>=0&&y<m){
                if(map[x][y]==1&&!visited[x][y]){
                    queue.offer(new int[]{x,y});
                    visited[x][y]=true;
                    map[x][y]=map[curX][curY]+1;

                    }
               }
            }
            
            
        }


        
        
      

    }
    
}
