import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class B11723 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Set<Integer> set=new HashSet<>();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++)
        { 
            String a=bf.readLine();
            StringTokenizer st=new StringTokenizer(a);
            switch (st.nextToken()) {
                case "add":
                    add(set, Integer.parseInt(st.nextToken()));
                    break;
                    case "remove":
                    remove(set, Integer.parseInt(st.nextToken()));
                    break;
                    case "check":
                    check(set, Integer.parseInt(st.nextToken()),bw);
                    break;
                    case "toggle":
                    toggle(set, Integer.parseInt(st.nextToken()));
                    break;
                    case "all":
                    all(set);
                    break;
                    case "empty":
                    empty(set);
                    break;
                default:
                    break;
            }

        }
        bw.flush();
    }
    public static void add(Set<Integer> set,int x)
    {
        set.add(x);
    }
    public static void remove(Set<Integer>set,int x)
    {
        if(set.contains(x))
        set.remove(x);
    }
    public static void check(Set<Integer> set,int x,BufferedWriter bw) throws IOException
    {

        if(set.contains(x))
       {bw.write(
        "1");
        bw.newLine();
       
    
       }
        else 
        {
        bw.write("0");
        bw.newLine();
       
     
        }
      
    }
    public static void toggle(Set<Integer> set,int x)
    {
        if(!set.contains(x))
        set.add(x);
        else
        set.remove(x);

    }
    public static void all(Set<Integer> set)
    {
        
        set.clear();
        Collections.addAll(set,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
    }
    public static void empty(Set<Integer> set)
    {
        set.clear();
    }

}
