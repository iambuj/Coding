import java.util.Scanner;

class Employee {
    public void work() {
        System.out.println("Hello Ambuj");
    }
}

class Developer extends Employees{
    public void work() {
        System.out.println("Hiii Abhinav");
    }
}

public class InheritanceEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Developer d1 = new Developer();
        d1.work();
    }
}