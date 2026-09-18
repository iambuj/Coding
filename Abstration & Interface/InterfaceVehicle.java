interface Vehicle {
    void start();
}
class Bike implements Vehicle{
    public void start() {
        System.out.println("Bike Starting ...");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car Starting ...");
    }
}

public class InterfaceVehicle {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        Car c = new Car();
        c.start();
    }
}
