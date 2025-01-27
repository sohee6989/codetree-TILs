import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        multiply(a, b);

    }

    public static void multiply(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        
        System.out.println(result);
    }
}