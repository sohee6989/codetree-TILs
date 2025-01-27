import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isPrimeNum(i) && sumNum(i)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static boolean isPrimeNum(int A){
        if(A == 1){
            return false;
        }
        for(int i = 2; i < A; i++){
            if(A % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean sumNum(int B){
        int secNum = B % 10;
        int firNum = B /= 10;

        if((secNum + firNum) % 2 == 0){
            return true;
        }
        return false;
    }
}