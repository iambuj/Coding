import java.util.Scanner;

class Car {
    String brand;
    int price;

    public void about() {
        System.out.println("This is a " + this.brand + " Car");
        System.out.println("The price of the car is = " + this.price);
    }
}


public class QCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        Car c1 = new Car();

        c1.brand = sc.nextLine();
        c1.price = sc.nextInt();

        c1.about();

    }
}
