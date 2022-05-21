import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HanoiMovingSeq_11729 {
    
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2,N)-1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }    

    public static void Hanoi(int N, int start, int mid, int dest) {
        if (N==1) {
            sb.append(start+" "+dest+"\n");
            return;
        }

        Hanoi(N-1, start, dest, mid);
        sb.append(start+" "+dest+"\n");
        Hanoi(N-1, mid, start, dest);
    }
}
