import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        printSqure(N);
    }

    public static void printSqure(int N){
        int result = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                result++;
                System.out.print(result + " ");
                if(result == 9){
                    result = 0;
                }
            }
            System.out.println();
        }
    }
}