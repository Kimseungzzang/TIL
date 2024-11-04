import java.util.Scanner;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0; // 문자의 개수를 셀 변수

        for (int i = 0; i < s.length(); i++) {
            // 문자열의 끝에 도달했거나, 마지막에서 두 번째 문자에 도달했을 때
            if (i == s.length() - 1) {
                sum++;
                break;
            }

            // 현재 문자와 다음 문자를 합쳐 문자열을 만듦
            String current = s.substring(i, i + 2);

            // 크로아티아 알파벳 처리
            if (current.equals("c=") || current.equals("c-") || current.equals("d-") ||
                current.equals("lj") || current.equals("nj") || current.equals("s=") ||
                current.equals("z=")) {
                i++; // 크로아티아 알파벳을 처리했으므로 인덱스를 추가로 증가
            } else if (current.equals("dz") && i < s.length() - 2 && s.charAt(i + 2) == '=') {
                i += 2; // "dz=" 처리
            }
            sum++;
        }

        System.out.println(sum);
    }
}
