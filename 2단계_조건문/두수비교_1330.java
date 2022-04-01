import java.util.Scanner;
public class 두수비교_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        System.out.println((A>B) ? ">" :  ((A<B) ? "<" : "=="));
    }
}