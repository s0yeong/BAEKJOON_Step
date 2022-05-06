public class selfNumber_4673 {
    public static void main(String[] args) {
        
        boolean[] tf = new boolean[10001];

        for (int i=1; i<10001; i++) {
            int n = d(i);

            if (n<10001) {
                tf[n] = true;
            }
        }

        for (int i=1; i<10001; i++) {
            if (!tf[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int num) {
        int sum = num;
    
        while(num != 0) {
            sum += (num%10);
            num /= 10;
        }
    
        return sum;
    }
    
}
