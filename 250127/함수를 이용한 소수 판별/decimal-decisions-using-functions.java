import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();

      int result = 0;


      for(int i = a; i <= b; i++){
        if(isPrime(i)){
            result += i;
        }
    }
        System.out.println(result);
    }

    public static boolean isPrime(int i){

        if(i == 1){
            return false;
        }
        
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                return false;
            }
    }
        return true;
}
}