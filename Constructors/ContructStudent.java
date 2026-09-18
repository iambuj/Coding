import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;

        System.out.println(name + " " + age);
    }
}

public class ContructStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(sc.nextLine() , sc.nextInt());

    }
}
