import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class NumberCard2_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++) {
            int result = Integer.parseInt(st.nextToken());
            sb.append(upper(arr, result) - lower(arr, result)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lower(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start<end) {
            mid = (start+end)/2;
            if (target<=arr[mid]) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }

        return start;
    }

    private static int upper(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start<end) {
            mid = (start+end)/2;
            if (target<arr[mid]) {
                end = mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
