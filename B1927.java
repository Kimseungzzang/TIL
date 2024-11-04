import java.util.Scanner;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class B1927 {
    static PriorityQueue<Integer> miniHeap;
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    miniHeap=new PriorityQueue<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int x=sc.nextInt();
        if(x!=0)
        {
            add(x);
        }
        else{
            resolve();
        }
    }

  } 
  public static void add(int x)
  {
    miniHeap.add(x);
    

  } 
  public static void resolve()
  {
    if(miniHeap.isEmpty())
    {System.out.println(0);
    }
    else{
    System.out.println(miniHeap.poll());
  
    } 
  }
}
