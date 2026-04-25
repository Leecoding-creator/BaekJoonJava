import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine().trim();

        // 2. 조건에 따라 결과 출력
        if (s.equals("(1)")) {
            System.out.println(0);
        } else if (s.equals(")1(")) {
            System.out.println(2);
        } else {
            // 그 외 모든 케이스 ( ( ) 1, 1 ( ), 1 ) (, ) ( 1 )는 1번만 옮기면 됨
            System.out.println(1);
        }
    }
}