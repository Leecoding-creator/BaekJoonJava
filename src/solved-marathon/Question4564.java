import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultSb = new StringBuilder();

        while(true) {
            String s = br.readLine().trim();
            if(s.equals("0")) break;

            StringBuilder sb = new StringBuilder();
            sb.append(s).append(" ");

            while (s.length() > 1) {
                long product = 1;
                for(int i=0; i<s.length(); i++) {
                    product *= (s.charAt(i) - '0');
                }

                s = String.valueOf(product);
                sb.append(s).append(" ");
            }

            resultSb.append(sb.toString().trim()).append("\n");
        }

        System.out.println(resultSb);
    }
}