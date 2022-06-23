import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.HashSet;

public class NoListenedNoSeen_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<M; i++) {
            String tmp = br.readLine();
            if (set.contains(tmp)) {
                result.add(tmp);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }

    }
}
