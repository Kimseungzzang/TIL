import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B10845 {
    public static void main(String args[]) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> que=new ArrayList<>();
        int n=Integer.parseInt(bf.readLine());
     
        for(int i=0;i<n;i++)
        {
            String a=bf.readLine();
            StringTokenizer st=new StringTokenizer(a);

        switch (st.nextToken()) {
            case "push":
                push(que, Integer.parseInt(st.nextToken()));
                break;
        
                case "pop":
                System.out.println(pop(que));
                break;
                case "size":
                System.out.println(size(que));
                break;
                 case "empty":
                 System.out.println(empty(que));
                break;
                 case "front":
                 System.out.println(front(que));
                break; 
                case "back":
                System.out.println(back(que));
                break;
                


            default:
                break;
        }
    }
    }

    public static void push(List<Integer> list,int x)
    {
        list.add(x);
    }
    public static int pop(List<Integer>list)
    {
        if(!list.isEmpty()){
        int a=list.get(0);
        list.remove(0);
        return a;
        }
        else
        return -1;
    }
    public static int size(List<Integer> list)
    {
        return list.size();
    }
    public static int empty(List<Integer> list)
    {
        if(list.isEmpty())
        {
            return 1;
        }
        else
        return 0;
    }
    public static int front(List<Integer> list)
    {
        if(!list.isEmpty())
        {
            return list.get(0);
        }
        else
        return -1;

    }
    public static int back(List<Integer> list)
    {
        if(!list.isEmpty())
        {
            return list.get(list.size()-1);
        }
        else
        return -1;
    }
}
