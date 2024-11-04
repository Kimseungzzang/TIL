import java.util.*;
public class B2751 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList,(a,b)->{
            return a-b;
    }
        );
        for(int i:arrayList)
        {
            System.out.println(i);
        }
    }
}
