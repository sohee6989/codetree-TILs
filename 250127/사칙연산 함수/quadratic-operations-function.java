import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int a = s.nextInt();
       char o = s.next().charAt(0);
       int c = s.nextInt();

       if(o == '+'){
        plus(a, c);
       } else if (o == '-'){
        sub(a, c);
       } else if (o == '*'){
        mul(a, c);
       } else if (o == '/'){
        div(a, c);
       } else {
        System.out.println("False");
       }



    }

    public static void plus(int a, int c){
        System.out.println(a +" + " + c + " = " + (a+c));
    }

    public static void sub(int a, int c){
        System.out.println(a +" - " + c + " = " + (a-c));
    }

    public static void mul(int a, int c){
        System.out.println(a +" * " + c + " = " + (a*c));
    }

    public static void div(int a, int c){
        System.out.println(a +" / " + c + " = " + (a/c));
    }

}