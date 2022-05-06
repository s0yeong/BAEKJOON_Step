import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StudyWords_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alph = new int[26];
        String s = br.readLine();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                alph[s.charAt(i) - 'A']++;
            }
            else {
                alph[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ans = '?';

        for (int i=0; i<26; i++) {
            if (alph[i]>max) {
                max = alph[i];
                ans = (char)(i+'A');
            }
            else if (alph[i]==max) {
                ans = '?';
            }
        }
        System.out.print(ans);
    }
}
