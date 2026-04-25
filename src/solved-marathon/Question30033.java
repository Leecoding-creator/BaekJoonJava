import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. N 입력받기
        int n = Integer.parseInt(br.readLine());
        
        // 2. 계획량(A) 입력받아 배열에 저장하기
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        // 3. 실제 공부량(B) 입력받으면서 바로 비교하기
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(st.nextToken());
            // 계획보다 많이 하거나 똑같이 했으면 카운트 증가!
            if (b >= a[i]) {
                count++;
            }
        }
        
        // 4. 결과 출력
        System.out.println(count);
    }
}