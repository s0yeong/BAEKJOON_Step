import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class CompressCoordinate_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] originX = new int[N];
        int[] sortX = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            originX[i] = sortX[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortX);

        int rank=0;
        for (int val : sortX) {
            if(!rankMap.containsKey(val)) {
                rankMap.put(val, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : originX) {
            int rankX = rankMap.get(key);
            sb.append(rankX).append(' ');
        }
        System.out.println(sb);
    }
}
