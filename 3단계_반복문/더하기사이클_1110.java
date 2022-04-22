import java.util.Scanner;
public class 더하기사이클_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int cycle=0;
        int copyNum = N;

        while(true)
        {
            N = ((N%10)*10)+(((N/10)+(N%10))%10);
            cycle++;

            if(copyNum==N){
                break;
            }
        }
        System.out.println(cycle);

    }    
}
