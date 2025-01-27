import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int M = s.nextInt();
        int D = s.nextInt();

        if(isDay(M, D)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

    public static boolean isDay(int m, int d){
        if(m == 1 | m == 3 | m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(d >= 1 && d <= 31){
                return true;
            }
            return false;
        } else if(m == 2){
            if(d >= 1 && d <= 28){
                return true;
            }
            return false;
        } else if(m == 4 || m == 6 || m == 9 | m == 11){
            if(d >= 1 && d <= 31){
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}