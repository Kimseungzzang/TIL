import java.util.*;
public class B1764 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); 
       int m=sc.nextInt();
       sc.nextLine();
       Set<String> noSee = new HashSet<>();
       Set<String> noListen = new HashSet<>();
       for(int i=0;i<n;i++)
       {
        noSee.add(sc.nextLine());
       }
       for(int i=0;i<m;i++)
       {
        noListen.add(sc.nextLine());
       }
       noSee.retainAll(noListen);
       List <String> noSeeListen=new ArrayList<>(noSee);
       Collections.sort(noSeeListen,(a,b)->
        a.compareTo(b)
       );
       System.out.println(noSee.size());

       for(String name:noSeeListen){
        System.out.println(name);
        
       }
    }
    
}
