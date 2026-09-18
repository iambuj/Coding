import java.util.Scanner;

class Animal {
    public void sound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    public void sound() {
        System.out.println("Dog Barks...");
    }
}
public class InheritanceOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog d1 = new Dog();
        d1.sound();
    }
}