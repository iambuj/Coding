
import java.util.Scanner;

class Product{
    String name;
    int price;

    public void discountedPrice(int percent) {
        int dicount =( percent*price) / 100;
        int newprice = price - dicount;
        System.out.println("Product = " + this.name);
        System.out.println("Old price = " + this.price);
        System.out.println("Discounted price = " + newprice);
    }
}

public class QProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        p1.name = sc.nextLine();
        p1.price = sc.nextInt();
        p1.discountedPrice(sc.nextInt());
    }
}
