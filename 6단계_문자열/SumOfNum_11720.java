import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumOfNum_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for (byte num : br.readLine().getBytes()) {
            sum += (num - '0');
        }

        System.out.print(sum);
    }
}
