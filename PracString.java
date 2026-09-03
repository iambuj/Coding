
import java.util.Scanner;

public class PracString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();

        StringBuilder sb = new StringBuilder(Word);
        
        for(int i = 0; i < sb.length()/2; i++) {

            int f = i;
            int b = sb.length() - 1 - i;

            char fchar = sb.charAt(f);
            char bchar = sb.charAt(b);

            sb.setCharAt(f, bchar);
            sb.setCharAt(b, fchar);

        }
        System.out.println(sb);
    }
}

class Reev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);

        sb.reverse();
        System.out.println(sb);
    }
}

class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Char = sc.nextLine();

        StringBuilder sb = new StringBuilder(Char);

        sb.reverse();

        if(sb.equals(sb.toString())) {
            System.out.println("is palindrome");
        }
        else{
            System.out.println("No its not palindrome");
        }
    }
}