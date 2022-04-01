import java.util.Scanner;
public class 주사위세개_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        sc.close();

        if(x1 == x2 && x2 == x3)
        {
            price = 10000+x1*1000;
        }
        else if(x1 == x2 || x1 == x3)
        {
            price = 1000+x1*100;
        }
        else if(x2 == x3)
        {
            price = 1000+x2*100;
        }
        else
        {
            price = Math.max(x1, Math.max(x2, x3))*100;
        }

        System.out.println(price);
    }
}
