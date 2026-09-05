import java.util.Scanner;

public class PracString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}