import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B11279 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int input=sc.nextInt();
            if(input==0)
            {
                if(maxHeap.isEmpty())
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(maxHeap.poll());
                }
            }
            else{
                maxHeap.offer(input);
            }
        }
    }
}
