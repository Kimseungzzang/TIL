
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
public class B1181 {
    
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            Set<String> array=new HashSet<>();

            for(int i=0;i<n;i++)
            {
             array.add(sc.nextLine());


            }
            List<String> arraysList=new ArrayList<>(array);
            Collections.sort(arraysList,(a,b)-> {
            if(a.length()!=b.length())
            {
                return a.length()-b.length();
            }
                else{
                    return a.compareTo(b);
                }
                 }
            );
                 
           
                   
                   
                
            
            for (String word : arraysList) {
                System.out.println(word);
            }
    }
}
