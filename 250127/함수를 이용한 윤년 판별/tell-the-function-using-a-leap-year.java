import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int y = s.nextInt();
        
        boolean result = false;

        if(y % 4 == 0){
            if(y % 100 == 0 && y % 400 != 0){
                System.out.println(result);
                return;
            }
            result = true;
            System.out.println(result);
            return;
        }

    }
}