import java.util.Scanner;

class Laptop{
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("Invalid Amount ...");
        }
        else{
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

public class EncapsulationLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop lp = new Laptop();
        System.out.print("Enter the brand name : ");
        lp.setBrand(sc.nextLine());
        System.out.print("Enter the price : ");
        lp.setPrice(sc.nextInt());
        System.out.println("Brand = " + lp.getBrand());
        System.out.println("Price = " + lp.getPrice());
        
    }
}
