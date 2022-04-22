import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 기찍N_2742 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i=N; i>0; i--)
        {
            System.out.println(i);
        }
    }
}