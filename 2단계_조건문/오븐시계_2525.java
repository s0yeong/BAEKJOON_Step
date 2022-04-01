import java.util.Scanner;
public class 오븐시계_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        H += time/60;
        M += time%60;

        while(M >= 60)
        {
            H += 1;
            M -= 60;
        }
        if(H >= 24)
        {
            H -= 24;
        }

        System.out.println(H + " " + M);
    }
}
