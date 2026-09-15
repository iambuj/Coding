import java.util.Scanner;

class Animal{
    String name;

    public void eat() {
        System.out.println(name + " eats egg daily");
    }
}

class Dog extends Animal{
    public void bark() {
        System.out.println(name + " Says bow bow");
    }
}

public class OInheritanceAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog a1 = new Dog();

        System.out.print("Enter the dog name : ");
        a1.name = sc.nextLine();

        a1.eat();
        a1.bark();
    }
}
