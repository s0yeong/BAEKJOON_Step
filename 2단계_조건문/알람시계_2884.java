import java.util.Scanner;
public class ěëěęł_2884 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int H = sc.nextInt();
         int M = sc.nextInt();
         sc.close();

        if(M < 45)
        {
            H--;
            M = 60-(45-M);
            if(H < 0)
            {
                H = 23;
            }
        }
        else
        {
            M -=45;
        }

        System.out.println(H + " " + M);
     }
}
