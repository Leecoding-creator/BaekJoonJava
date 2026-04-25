import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine().trim());

        int k = 64;

        while(n.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            n = n.divide(BigInteger.valueOf(2));
            k--;
        }

        System.out.println(k);
    }
}