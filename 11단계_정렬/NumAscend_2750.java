import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumAscend_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        
        for (int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if (arr[i]>arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
