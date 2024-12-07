import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        print(N);
    }

    public static void print(int N){
        for(int i = 0; i < N; i++){
            System.out.println("12345^&*()_");
        }
    }
}