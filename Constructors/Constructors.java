
import java.util.Scanner;

class Construct{
    String name;
    Construct(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Construct c1 = new Construct(sc.nextLine());
    }
}
