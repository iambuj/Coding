abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike starts with self/start button");
    } 
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with key or start button");
    }
}

public class PracticalQues2{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        Car c = new Car();
        c.start();
    }
}