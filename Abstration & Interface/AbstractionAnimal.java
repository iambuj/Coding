import java.util.Scanner;

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    public void sound() {
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow Meow");
    } 
}

public class AbstractionAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
}
