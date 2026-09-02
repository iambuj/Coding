
import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        String name = "Ambuj";
        System.out.println(name.substring(0,1));
    }
}

class ch {
    public static void main(String[] args) {
        String name = "Ambuj";
        System.out.println(name.substring(name.length() - 1));
    }
}

class Alag{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Lang = sc.nextLine();
        for (int i = 0; i < Lang.length(); i++) {
            System.out.println(Lang.charAt(i));
        }
    }
}