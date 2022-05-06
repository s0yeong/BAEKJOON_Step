import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArithmeticSequence_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(arithmetic_sequence(N));
    }

    public static int arithmetic_sequence(int num){
        int count=0;
    
        if (num<100) {
            count=num;
        }
        else if (num>=100) {
            count=99;
            for (int k=100; k<=num; k++) {
                if(((k%10)-(k/10)%10)==((k/10)%10)-(k/100)) {
                    count++;
                }
            }
        }
        return count;
    }
}

