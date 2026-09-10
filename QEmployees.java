
import java.util.Scanner;

class Employees {
    String name;
    int salary;

    public void about() {
        System.out.println("Employee name =  " + this.name);
        System.out.println("Salary = " + this.salary + "k");
    }
}

public class QEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees e1 = new Employees();
        
        System.out.print("Enter your name : ");
        e1.name = sc.nextLine();
        
        System.out.print("Enter your salary : ");
        e1.salary = sc.nextInt();

        e1.about();

    }
}