import java.io.IOException;

public class Sangsu_2908 {
    public static void main(String[] args) throws IOException {
        int A = 0, B = 0;

        A += System.in.read()-'0';
        A += (System.in.read()-'0')*10;
        A += (System.in.read()-'0')*100;

        System.in.read();

        B += System.in.read()-'0';
        B += (System.in.read()-'0')*10;
        B += (System.in.read()-'0')*100;

        System.out.print(A>=B ? A : B);

    }    
}
