import java.util.Scanner;

public class PracticalQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word2 = sc.nextLine();
        String a = word.toUpperCase();
        System.out.println( "Uppercase = " + a);
        String b = word.toLowerCase();
        System.out.println("Lowercase = " + b);
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println("Reversed = " + sb);
        if(word.equals(word2)) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not Equal...");
        }
    }
}