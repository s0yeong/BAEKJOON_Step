import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String[] S = br.readLine().split(" ");

            int R = Integer.parseInt(S[0]);
            String S1 = S[1];

            for (int j=0; j<S1.length(); j++) {
                for (int k=0; k<R; k++) {
                    System.out.print(S1.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
