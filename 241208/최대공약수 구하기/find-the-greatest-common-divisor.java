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

       maxNum(n, m);
    }

    public static void maxNum(int n, int m){
        int maxNum =1;
        if(n > m){
            for(int i = 1; i <= m; i++){
                if(n % i == 0 && m % i == 0){
                    maxNum = i;
                }
            }
        } else{
            for(int i = 1; i <= n; i++){
                if(n % i == 0 && m % i == 0){
                    maxNum = i;
                }
            }
        }
        System.out.print(maxNum);
    }
}