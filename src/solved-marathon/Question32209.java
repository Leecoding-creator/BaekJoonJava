import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int Q = Integer.parseInt(br.readLine().trim());
        int currentProblems = 0;
        boolean isHaisan = false; // 해산 여부를 체크하는 플래그

        while (Q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());

            if (type == 1) {
                // 문제 추가
                currentProblems += val;
            } else {
                // 문제 사용 전 체크
                if (currentProblems < val) {
                    isHaisan = true;
                    break; // 더 이상 볼 것도 없이 반복문 탈출!
                }
                currentProblems -= val;
            }
        }

        // 결과 출력
        if (isHaisan) {
            System.out.println("Adios");
        } else {
            System.out.println("See you next month");
        }
    }
}