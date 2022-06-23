import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.IOException;
import java.util.HashSet;

public class AnotherPartOfString_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        HashSet<String> set = new HashSet<>();
        int left, right;
        String sub=" ";

        for (int i=0; i<s.length(); i++) {
            left = 0;
            right = left+i;
            while (right<s.length()) {
                if (right == s.length() - 1) {
                    sub = s.substring(left);
                } else {
                    sub = s.substring(left, right+1);
                }
                if (!set.contains(sub)) {
                    set.add(sub);
                }
                left++;
                right++;
            }
        }
        System.out.println(set.size());
        
    }
}
