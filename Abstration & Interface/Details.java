import java.util.Scanner;

abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk() {
        System.out.println("Horse walks on 4 legs...");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Chicken walks on two legs...");    
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
    }
}
