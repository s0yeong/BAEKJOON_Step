import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Symmetry_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int num: setA) {
            if (!setB.contains(num)) {
                count++;
            }
        }

        for (int num: setB) {
            if (!setA.contains(num)) {
                count++;
            }
        }

        System.out.println(count);
        
    }
}
