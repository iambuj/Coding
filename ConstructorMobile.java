
import java.util.Scanner;

class Mobile{
    String brand;
    int price;

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("The brand of the mobile is " + brand);
        System.out.println("The price of the mobile is " + price);
    }
}

public class ConstructorMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile mb = new Mobile(sc.nextLine(), sc.nextInt());

        mb.display();

    }
}
