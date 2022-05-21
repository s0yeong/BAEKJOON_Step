import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 부녀회자이될테야_2775 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        int[][] APT = new int[15][15];
        
        for (int i=0; i<15; i++) {
            APT[i][1]=1;
            APT[0][i]=i;
        }
        
        for (int l=1; l<15; l++) {
            for (int j=2; j<15; j++) {
                APT[l][j] = APT[l][j-1]+APT[l-1][j];
            }
        }
        
        for (int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append('\n');
        }
        System.out.println(sb);
    }

}