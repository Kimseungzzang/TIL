import java.util.*;

public class B18111 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int B=sc.nextInt();
        Queue<int []> queue=new LinkedList<>();
        int map[][]=new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                map[i][j]=sc.nextInt();
            }
        } 
        int minTime=Integer.MAX_VALUE;
        int resultHeight=0;

        for(int targertHeight=0;targertHeight<=256;targertHeight++)
        {
            int removeBlocks=0;
            int addBlocks=0;

            for(int i=0;i<N;i++)
            {
                for(int j=0;j<M;j++)
                {
                    int currentheight=map[i][j];
                    if(currentheight>targertHeight)
                    {
                        removeBlocks+=currentheight-targertHeight;

                    }
                    else if(currentheight<targertHeight)
                    {
                        addBlocks+=targertHeight-currentheight;
                    }
                }
            }
            if(removeBlocks+B>=addBlocks)
            {
                int time=removeBlocks*2+addBlocks;

                if(time<minTime)
                {
                    minTime=time;;
                    resultHeight=targertHeight;
                }
                else if(time==minTime)
                {
                    resultHeight=Math.max(resultHeight,targertHeight);
                }
            }

        }
        System.out.println(minTime + " " + resultHeight);
      
     



    }
}
