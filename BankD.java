import java.util.Scanner;

class Salary{
    int basic;
    int bonus;

    public void salary(int basic) {
        System.out.println("Normal Salary = " + basic + "$");
    }

    public void salary(short bonus) {
        System.out.println("Bonus Salary = " + bonus + "$");
    }

    public void salary(int basic , int bonus) {
        int total = basic + bonus;
        System.out.println("Total salary = " + total + "$");
    }
}

public class BankD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary s1 = new Salary();

        System.out.print("Enter the salary : ");
        s1.basic = sc.nextInt();
        System.out.print("Enter the bonus : ");
        s1.bonus = sc.nextInt();

        s1.salary(s1.basic);
        s1.salary(s1.bonus);
        s1.salary(s1.basic , s1.bonus);
    }
}
