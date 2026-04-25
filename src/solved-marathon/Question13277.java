import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger; // 큰 수를 다루기 위한 필수 임포트!
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 문자열로 들어온 큰 수를 BigInteger로 생성
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        // 2. 곱셈 수행 (A * B 가 아니라 A.multiply(B))
        System.out.println(A.multiply(B));
    }
}