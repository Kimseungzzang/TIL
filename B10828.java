import java.util.*;
public class B10828 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String x=sc.nextLine();
            StringTokenizer st=new StringTokenizer(x);
            switch (st.nextToken()) {
                case "push":
                    push(array,Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop(array));
                    break;
                case "size":
                    System.out.println(size(array));
                    break;
                case "empty":
                    System.out.println(empty(array));
                    break;
                case "top":
                    System.out.println(top(array));
                    break;
               
                
            }
        }
    }




    public static  void push(List<Integer> list,int x)
    {
     list.add(0, x);  
    }
    public static  int pop(List<Integer> list){
        if(!list.isEmpty()){
        int n=list.get(0);
        list.remove(0);
        return n;
        }
        else
        return -1;

    }
    public static <T>  int size(List<T> list)
    {
        return list.size();
    }
    public static int empty(List<Integer> list)
    {
        if(list.isEmpty())
        return 1;
        else
        return 0;
    }
    public static int top(List<Integer> list)
    {
        if(!list.isEmpty()){
            return list.get(0);
        }
        else
        return -1;
    }

}
