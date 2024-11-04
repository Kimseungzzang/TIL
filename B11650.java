import java.util.*;
public class B11650 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        List<position> positionList=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            positionList.add(new position(x,y));
        }
       Collections.sort(positionList, (x,y)->{
        if(x.getX()!=y.getX())
        {
            return x.getX()-y.getX();
        }
        else
        {
        return x.getY()-y.getY();
        }
       });

       for(position p:positionList)
       {
        System.out.println(p.getX()+ " "+ p.getY());
       }
    }



}
class position{
    private int x;
    private int y;

    position(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
    int getX()
    {
        return this.x;
    }
    int getY()
    {
        return this.y;
    }
}

