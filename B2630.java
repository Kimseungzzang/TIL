import java.util.Scanner;

public class B2630 {
    static int blue;
    static int white;
    static int[][] paper;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        paper=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                paper[i][j]=sc.nextInt();
            }
        }
        cut(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void cut(int x,int y,int n)
    {
     if(isSameColor(x, y, n))
     {
        if(paper[x][y]==0)
        {
            white++;
        }
        else
        {
            blue++;
        }
        return;
     }
     int newSize=n/2;
     cut(x,y,newSize);
     cut(x+newSize,y,newSize);
     cut(x,y+newSize,newSize);
     cut(x+newSize,y+newSize,newSize);
        
    }
    public static boolean isSameColor(int x, int y, int n)
    {
        int color=paper[x][y];
        for(int i=x;i<x+n;i++)
        {
            for(int j=y;j<y+n;j++)
        {
            if(paper[i][j]!=color)
            {
                return false;
            }
        }
        }
        return true;
    }
}
