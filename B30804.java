import java.util.*;

public class B30804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] fruits = new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        int maxLen = 0, left = 0;

        for(int right=0;right<n;right++)
        {
            countMap.put(fruits[right],countMap.getOrDefault(fruits[right],0 )+1);
            while(countMap.size()>2)
            {
                countMap.put(fruits[left],countMap.get(fruits[left])-1);
                if(countMap.get(fruits[left])==0)
                {
                    countMap.remove(fruits[left]);
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);

        }
        System.out.println(maxLen);
        }
    }

        
    
