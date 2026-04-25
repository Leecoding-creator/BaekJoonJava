import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 단어 개수 N 읽기 (사실 StringTokenizer로 하나씩 꺼내면 N을 안 써도 되지만 연습 삼아!)
        int n = Integer.parseInt(br.readLine());
        
        // 2. 단어들이 있는 둘째 줄 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        // 3. 토큰이 없을 때까지 꺼내서 "DORO" 붙이기
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            sb.append(word).append("DORO").append(" ");
        }
        
        // 4. 완성된 도로롱의 말 출력!
        System.out.println(sb.toString().trim());
    }
}