import java.util.Scanner;

public class Calculatorrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sign = sc.next();
        if(sign.equals("+")){
            System.out.println(a+b);
        }
        else if(sign.equals("*")) {
            System.out.println(a*b);
        }
        else if(sign.equals("-")) {
            System.out.println(a-b);
        }
        else if(sign.equals("/")) {
            System.out.println(a/b);
        }
        else if(sign.equals("%")) {
            System.out.println(a%b);
        }
        else{
            System.out.println("Enter the valid sign...");
        }
    }
}
