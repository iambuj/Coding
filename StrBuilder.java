
import java.util.Scanner;

public class StrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(word);
    // setCharAt -> replaces the char with a new given char at given index.

        sb.setCharAt(0, 'A');

        System.out.println(sb);
    }
}

class S{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        
        sb.insert(0, 'A');

        System.out.println(sb);
    }
}

class Del{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(word);

        sb.delete(2, 4);
        System.out.println(sb);
    }
}

class Append{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        StringBuilder sb = new StringBuilder(Word);

        sb.append(a);
        sb.append(b);
        sb.append(c);
        sb.append(d);

        System.out.println(sb);

    }
}

class Rever{
    public static void main(String args[]) {
        String n = "Ambuj Tripathi";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char endchar = sb.charAt(back);

            sb.setCharAt(front, endchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}