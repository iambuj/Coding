
import java.util.Scanner;

class Student {
    int age;

    public void isEligible() {
        if(age < 18) {
            System.out.println("Not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}

public class QStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();

        System.out.print("Enter your age : ");
        s1.age = sc.nextInt();

        s1.isEligible();
    }
}
