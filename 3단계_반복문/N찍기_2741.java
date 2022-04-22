import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N찍기_2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i=1; i<=N; i++)
        {
            System.out.println(i);
        }
    }    
}
