import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulatiionStudennt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.setName(sc.nextLine());
        s.setAge(sc.nextInt());

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}