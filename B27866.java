import java.util.Scanner;

public class B27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
       
        char key = s.charAt(i-1);
        System.out.println(key);
        sc.close();
    }
}
