import java.util.Scanner;

class Mobile{
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

}

public class EncapsulationMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile mb = new Mobile();
        mb.setBrand(sc.nextLine());
        mb.setPrice(sc.nextInt());
        System.out.println(mb.getBrand());
        System.out.println(mb.getPrice());
    }
}
