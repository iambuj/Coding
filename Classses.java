
import java.util.Scanner;

class Bank {
    String name;
    String State;
    int amount;

    public void about() {
        System.out.println(this.name);
        System.out.println(this.State);
        System.out.println(this.amount);
    }
}

public class Classses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b1 = new Bank();
        b1.name = sc.nextLine();
        b1.State = sc.next();
        b1.amount = sc.nextInt();

        b1.about();
    }
}
