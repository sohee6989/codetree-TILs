import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        leastNum(a, b, c);
    }

    public static void leastNum(int a, int b, int c){
        int leastNum = 0;
        if(a <= b){
            if(a <= c){
                leastNum = a;
            } else {
                leastNum = c;
            }
        } else{
            if(b <= c){
                leastNum = b;
            } else {
                leastNum = c;
            }
        }

        System.out.println(leastNum);
    }
}