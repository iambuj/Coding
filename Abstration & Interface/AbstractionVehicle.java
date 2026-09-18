import java.util.Scanner;

abstract class Vehicle{
    abstract void start();
}

class Bike extends Vehicle{
    public void start() {
        System.out.println("Bike Starting...");
    }
}

class Car extends Vehicle{
    public void start() {
        System.out.println("Car Starting...");
    }
}

public class AbstractionVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike b = new Bike();
        b.start();
        Car c = new Car();
        c.start();
    }
}