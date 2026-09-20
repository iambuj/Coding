import java.util.Scanner;

class Bank{
    String name;
    static String bankName = "SBI";
    public void display() {
        System.out.println("Account = " + name);
        System.out.println("Bank = " + bankName);
    }
}

public class StaticBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        b.name = sc.nextLine();
        Bank b2 = new Bank();
        b2.name = sc.nextLine();
        
        b.display();
        b2.display();
        
    }
}
