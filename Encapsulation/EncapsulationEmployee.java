import java.util.Scanner;

class Employee{
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class EncapsulationEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        e.setName(sc.nextLine());
        e.setSalary(sc.nextInt());
        System.out.println("Employee name = " + e.getName());
        System.out.println("Employee salary = " + e.getSalary());

    }
}
