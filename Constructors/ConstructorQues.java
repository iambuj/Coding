import java.util.Scanner;

class Student{
    String name;
    int rollno;

    Student(String name , int rollno) {
        this.name = name;
        this.rollno = rollno;

    }
    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Roll no = " + rollno);
    }
}

public class ConstructorQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(), sc.nextInt());
        s.display();
    }
}
