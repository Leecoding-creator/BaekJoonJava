import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 고속 입력을 위한 세팅 (Scanner보다 훨씬 빠름!)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. N개의 숫자를 배열에 저장
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄 읽어서 쪼개기
        
        // 예: N개의 숫자가 들어있는 줄 읽기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 2. 이분 탐색을 위한 정렬 (필수!)
        Arrays.sort(arr);
        
        // 3. M 입력 및 탐색 시작
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            
            // Java 내장 이분 탐색 함수 사용
            if (Arrays.binarySearch(arr, target) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        
        // 4. 결과 한 번에 출력
        System.out.print(sb);
    }
}
