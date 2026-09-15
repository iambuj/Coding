import java.util.Scanner;

class Person{

    Person(String name) {
        System.out.println("Name is = " + name);
    }
}

class Student extends Person {
    Student(String name , int rollno) {
        System.out.println("Name is = " + name);
        System.out.println("Roll no is = " + rollno);
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
