import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PocketmonMaster_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pocketmonMap = new HashMap<String, Integer>();
        String[] pkname = new String[N+1];
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<N+1; i++) {
            String name = br.readLine();
            pocketmonMap.put(name, i);
            pkname[i] = name;
        }

        while (M-->0) {
            String findStr = br.readLine();
            if (isNum(findStr)) {
                int index = Integer.parseInt(findStr);
                sb.append(pkname[index]);
            }
            else {
                sb.append(pocketmonMap.get(findStr));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean isNum(String s) {
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
