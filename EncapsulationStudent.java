import java.util.Scanner;

class Student{
    private int age;

    public void setAge(int age) {
        this.age = age;
        if(age < 0) {
            System.out.println("Enter valid age...");
        }
        else{
            System.out.println("Age = " + age);
        }
    }
    public int getAge() {
        return age;
    }
}

public class EncapsulationStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("Enter your age : ");
        s1.setAge(sc.nextInt());

    }
}
