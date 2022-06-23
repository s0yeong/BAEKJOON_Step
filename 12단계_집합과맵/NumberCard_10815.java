import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class NumberCard_10815 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<M; i++) {
            int result = BinarySearch(Integer.parseInt(st.nextToken()));
            if (result != -1) {
                System.out.print(1+ " ");
            }
            else {
                System.out.print(0+" ");
            }
        }
    }

    private static int BinarySearch(int target) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start<=end) {
            mid = (start+end)/2;
            if (arr[mid]<target) {
                start = mid + 1;
            }
            else if (arr[mid]>target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
