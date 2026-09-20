import java.util.Scanner;

class Employee{
    String name;
    static String company;
}

public class StaticEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter the Employee name : ");
        e.name = sc.nextLine();
        System.out.print("Enter the Company name : ");
        Employee.company = sc.nextLine();
        Employee e2 = new Employee();
        System.out.print("Enter the Employee name : ");
        e2.name = sc.nextLine();
        Employee.company = "Microsoft";
        System.out.println("Name of Employee = " + e.name);
        System.out.println("Company = " + Employee.company);
        System.out.println("Name of Employee = " + e2.name);
        System.out.println("Company = " + Employee.company);
    }
}
