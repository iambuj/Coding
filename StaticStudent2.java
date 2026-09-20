import java.util.Scanner;

class Student {
    String name;
    static int count = 0;

    Student() {
        count++;
        System.out.println("Count = " + count);
    }  
}

public class StaticStudent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.name = sc.nextLine();
        Student s2 = new Student();
        s2.name = sc.nextLine();
        Student s3 = new Student();
        s3.name = sc.nextLine();
    }
}
