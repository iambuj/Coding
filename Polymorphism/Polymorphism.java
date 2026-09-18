import java.util.Scanner;

class Student{
    String name;
    int age;

    public void Info(String name ) {
        System.out.println("NAme = " + name);
    }

    public void Info(int age) {
        System.out.println("Age = " + age);
    }

    public void Info(String name , int age ) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.age = sc.nextInt();

        s1.Info(s1.name, s1.age);
    }
}
