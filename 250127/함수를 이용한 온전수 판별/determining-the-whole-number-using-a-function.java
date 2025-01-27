import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isCompleteNum(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isCompleteNum(int a){
        if(a % 2 == 0)
            return false;
        
        if(a % 10 == 5)
            return false;
        
        if(a % 3 == 0 && a % 9 != 0)
            return false;
        
        return true;
    }
}