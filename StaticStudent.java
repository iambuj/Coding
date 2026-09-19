import java.util.Scanner;

class Student{
    String name;
    static String college;
}

public class StaticStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter your name : ");
        s.name = sc.next();
        System.out.print("Enter your college name : ");
        Student.college = sc.next();
        Student s2 = new Student();
        System.out.print("Enter your name 2 : ");
        s2.name = sc.next();
        System.out.println(s.name);
        System.out.println(Student.college);
        System.out.println(s2.name);
        System.out.println(Student.college);

    }
}
