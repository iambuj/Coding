import java.util.Scanner;

interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog d = new Dog();
        d.sound();
    }
}
