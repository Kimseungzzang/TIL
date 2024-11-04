import java.util.*;
public class B2805 {
    static  int[] trees;
    static int n;
    static int m;
    static int maxHeight=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        m=sc.nextInt();
        trees=new int[n];
        for(int i=0;i<n;i++)
        {
            trees[i]=sc.nextInt();
        }
        Arrays.sort(trees);
      
        binarySearch(0,trees[n-1]);
        System.out.println(maxHeight);
        

    }
    public static void binarySearch(int left,int right)
    {
        while(left<=right){
            int mid=(left+right)/2;
            long sum=0;
            for(Integer tree:trees)
            {
                if(tree>mid)
                {
                    sum+=tree-mid;
                }
            }
            if(sum>=m){
                maxHeight=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
       
    }
}
