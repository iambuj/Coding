import java.util.Scanner;

class Student {
    String name;

    public void Name(){
        System.out.println("Name = " + this.name);
    }
}

public class Q3Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        s1.name = sc.nextLine();

        Student s2 = new Student();
        s2.name = sc.nextLine();

        Student s3 = new Student();
        s3.name = sc.nextLine();

        s1.Name();
        s2.Name();
        s3.Name();
    }
}
