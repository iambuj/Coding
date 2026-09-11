
import java.util.Scanner;

class Student {
    String name;
    int marks;

    public void display() {
        if (this.marks >= 90 && this.marks <= 100) {
            System.out.println("A grade");
        }
        else if(this.marks >= 75 && this.marks <= 89) {
            System.out.println("B grade");
        }
        else if(this.marks >= 60 && this.marks <= 75) {
            System.out.println("C grade");
        }
        else {
            System.out.println("D grade");
        }
    }
}

public class QStudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        s1.name = sc.nextLine();
        s1.marks = sc.nextInt();

        s1.display();
    }
}
