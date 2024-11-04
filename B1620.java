import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1620 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bf.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        // 포켓몬 번호로 이름을 찾을 때 사용할 리스트
        List<String> numberToName = new ArrayList<>(N + 1);

        // 포켓몬 이름으로 번호를 찾을 때 사용할 맵
        Map<String, Integer> nameToNumber = new HashMap<>(N + 1);

        // 1-based 인덱스를 맞추기 위해 리스트 첫 번째는 비워둠
        numberToName.add("");

        for (int i = 1; i <= N; i++) {
            String name = bf.readLine();
            numberToName.add(name);       // 번호로 이름 찾기용 리스트
            nameToNumber.put(name, i);    // 이름으로 번호 찾기용 맵
        }

        for (int i = 0; i < M; i++) {
            String input = bf.readLine();

            if (input.matches("-?\\d+")) {
                // 입력이 숫자일 경우: 번호로 포켓몬 이름 찾기
                int number = Integer.parseInt(input);
                System.out.println(numberToName.get(number));  // 번호로 이름 출력
            } else {
                // 입력이 문자일 경우: 이름으로 포켓몬 번호 찾기
                System.out.println(nameToNumber.get(input));   // 이름으로 번호 출력
            }
        }
    }
}