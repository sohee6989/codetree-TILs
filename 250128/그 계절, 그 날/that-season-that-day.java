import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int Y = s.nextInt();
        int M = s.nextInt();
        int N = s.nextInt();

        isSeason(Y, M, N);
    }

    public static void isSeason(int y, int m, int n){
        if(isDayExist(y, m, n)){
            if(m >= 3 && m <= 5){
                System.out.println("Spring");
            } else if(m >= 6 && m <= 8){
                System.out.println("Summer");
            } else if(m >=9 && m <= 11){
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isDayExist(int y, int m, int n){
        
        if (m == 2){
            if(leapYear(y)){
                if (n >= 1 && n <= 29){
                    return true;
                }
                return false;
            } else {
                if (n >= 1 && n <= 28){
                    return true;
                } 
                return false;
        }
        } else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(n >= 1 && n <= 31){
                return true;
            }
            return false;
        } else if(m == 4 || m == 6 || m == 9 || m == 11){
            if(n >= 1 && n <= 30){
                return true;
            }
            return false;
        } else {
            return false;
        }
    
    }

    public static boolean leapYear(int y){
        if(y % 4 == 0){
            if(y % 100 == 0){
                if(y % 400 == 0){
                    return true;
                }
                return false;
            } 
            return true;
        } 
        return false;
    }
}