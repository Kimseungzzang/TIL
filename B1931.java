
import java.util.*;
public class B1931 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        List<int[]> list=new LinkedList<>();
        for(int i=0;i<N;i++)
        {
            list.add(new int[]{sc.nextInt(),sc.nextInt()});
        }
        Collections.sort(list, (a,b)->{
            if(a[1]==b[1])
            {
                return Integer.compare(a[0], b[0]);
            }
            else
            return Integer.compare(a[1], b[1]);
        });

        int stopTime=-1;
        int sum=0;
        for(int[] time:list)
        {
            int starttime=time[0];
            int lasttime=time[1];
            if(starttime>=stopTime)
            {
                stopTime=lasttime;
               

                sum++;
            }
        }
        System.out.println(sum);
    }

}
