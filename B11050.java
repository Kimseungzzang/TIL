import java.util.Scanner;

public class B11050 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int N=1;
        int K=1;
        int nk=n-k;
        int NK=1;
        for(int i=1;i<=n;i++){
            N=N*i;
        }
        for(int i=1;i<=nk;i++){
            NK=NK*i;
        }
        for(int i=1;i<=k;i++){
            K=K*i;
        }

        System.out.printf("%d",N/(K*NK));


        sc.close();

    }   
}
