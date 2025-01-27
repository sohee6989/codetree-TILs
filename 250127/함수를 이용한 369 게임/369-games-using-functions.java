import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(is3rdNumber(i)){
                cnt++;
            }
        }
         System.out.println(cnt);
    }

    public static boolean is3rdNumber(int i){
        return number369(i) || i % 3 == 0;
    }

    public static boolean number369(int i){
        boolean result2 = false;
        while(i > 0){
            if(i % 10 == 3 || i % 10 == 6 || i % 10 ==9){
                result2 = true;
            } 
              i /= 10;
        }

        return result2;
    }

}