import java.util.Scanner;

class Car{
    Scanner sc = new Scanner(System.in);

    String model;
    int year;
    int price;
    String manufacturer;
    String colour;
    float speed;
    String carsold;

    void create() {
        System.out.print("Enter the model of the car : ");
        model = sc.nextLine();
        System.out.print("Enter the year of the car : ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the price of the car : ");
        price = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the manufacturer of the car : ");
        manufacturer = sc.nextLine();
        System.out.print("Enter the colour of the car : ");
        colour = sc.nextLine();
        System.out.print("Enter the top speed of the car : ");
        speed = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the status of car : ");
        carsold = sc.nextLine();

    }

    void details() {
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Price = " + price);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Colour = " + colour);
        System.out.println("Top Speed = " + speed);
    }

    void sold() {
        if (carsold.equalsIgnoreCase("yes")) {
            System.out.println("Car Status Sold...");
        } else {
            System.out.println("car status Available...");
        }
    }
}

public class PracticalQues4 {
    public static void main(String[] args) {
        Car santroXing = new Car();
        santroXing.create();
        System.out.println("______CAR - 1______");
        santroXing.sold();
        santroXing.details();

        
        Car alto = new Car();
        alto.create();
        System.out.println("______CAR - 2______");
        alto.sold();
        alto.details();

        
        Car wagonR = new Car();
        wagonR.create();
        System.out.println("______CAR - 3______");
        wagonR.sold();
        wagonR.details();
    }
}
