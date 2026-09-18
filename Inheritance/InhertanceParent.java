import java.util.*;

class Person{
    String name;
    int age;
}

class Student extends Person {
    int rollno;

    public void DisplayInfo() {
        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);
        System.out.println("Roll no is = " + rollno);
    } 
}

public class InhertanceParent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.name = sc.nextLine();
        s.age = sc.nextInt();
        s.rollno = sc.nextInt();

        s.DisplayInfo();
    }
}
