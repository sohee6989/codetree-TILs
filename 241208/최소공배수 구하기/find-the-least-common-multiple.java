import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        minNum(n, m);
    }

    public static void minNum(int n, int m){
        int minNum = 0;
        if(n > m){
            for(int i = n; ; i++){
                if(i % n == 0 && i % m == 0){
                    minNum = i;
                    System.out.print(minNum);
                    return;
                }
            }
        }

        if(m > n){
            for(int i = m; ; i++){
                if(i % n == 0 && i % m == 0){
                    minNum = i;
                    System.out.print(minNum);
                    return;
                }
            }
        }
    }
}