
import java.util.Scanner;

class Student {
    String name;
    int claass;
    int rollno;
    int age;

    public void info() {
    System.out.println(this.name);
    System.out.println(this.claass);
    System.out.println(this.rollno);
    System.out.println(this.age);
}
        
    }


public class Oopss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        System.out.print("Enter Your name : ");
        s1.name = sc.nextLine();
        System.out.print("Enter Your Class : ");
        s1.claass = sc.nextInt();
        System.out.print("Enter Your roll no : ");
        s1.rollno = sc.nextInt();
        System.out.print("Enter Your age : ");
        s1.age = sc.nextInt();

        s1.info();
    }
}
