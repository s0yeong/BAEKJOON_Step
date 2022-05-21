import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 분수찾기_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int n=0;
        int top=1, bottom=1;
        int count = 0;

        if (X==1) {
            System.out.println("1/1");
        }
        else {
            while(count<X) {
                n++;
                count=n*(n+1)/2;
            }
            int num=X-(n-1)*n/2;
            if (n%2==0) {
                top=num;
                bottom=n-num+1;
            }
            else {
                top=n-num+1;
                bottom=num;
            }
            System.out.println(top+"/"+bottom);
        }
    }
}