public class Dial_5622 {
    public static void main(String[] args) throws Exception{
        int time=0;
        int words;

        while (true) {
            words = System.in.read();

            if (words=='\n') {
                break;
            }

            if (words<'D') time+=3;
            else if (words<'G') time+=4;
            else if (words<'J') time+=5;
            else if (words<'M') time+=6;
            else if (words<'P') time+=7;
            else if (words<'T') time+=8;
            else if (words<'W') time+=9;
            else time+=10;

        }
        System.out.print(time);

    }
    
}