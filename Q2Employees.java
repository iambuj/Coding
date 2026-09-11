
import java.util.Scanner;

class Employees {
    String name;
    int age;
    int salary;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }
}

public class Q2Employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees e1 = new Employees();
        
        e1.name = sc.nextLine();
        e1.age = sc.nextInt();
        e1.salary = sc.nextInt();

        sc.nextLine();

        Employees e2 = new Employees();
        e2.name = sc.nextLine();
        e2.age = sc.nextInt();
        e2.salary = sc.nextInt();

        if(e1.salary > e2.salary) {
            System.out.println(e1.name + " has " + e1.salary + " More salary");
        }
        else {
            System.out.println(e2.name + " has " + e2.salary + " More salary");
        }

        e1.display();
        e2.display();
    }
}


