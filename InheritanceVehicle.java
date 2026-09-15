import java.util.Scanner;

class Vehicle{
    String brand;

    public void displaybrand() {
        System.out.println("The brand of the car is = " + brand);
    }
}

class Car extends Vehicle{
    String model;

    public void displayModel() { 
        System.out.println("Model of the car is = " + model);
    }
}

public class InheritanceVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c1 = new Car();
        
        c1.brand = sc.nextLine();
        c1.model = sc.nextLine();

        c1.displaybrand();
        c1.displayModel();
        
    }
}
