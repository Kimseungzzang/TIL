import java.util.Scanner;
public class B1157 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String S=s.toUpperCase();
        int [] a=new int[26];
        for(int j=0;j<S.length();j++){
        for(char i='A';i<='Z';i++){
            if(S.charAt(j)==i)
            {
               a[i-65]++; 
            }
        }
        }
        int max=-1;
        char maxChar=0;
        for(int j=0;j<26;j++)
        {
            if(a[j]>max)
        {            
                max=a[j];
                maxChar=(char)(j+65);

            }
            else if(a[j]==max)
            {
                maxChar='?';
            }
            
        }
        System.out.println(maxChar);
}
}
