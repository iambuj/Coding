import java.util.Scanner;

class Mobile{
    String company;
    int ram;
    int stroage;

    public void data()  {
        System.out.println("Company = " + this.company);
        System.out.println("Ram = " + this.ram + "GB");
        System.out.println("Storage = " + this.stroage + "GB");
    }
}

public class QMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));


        Mobile mb1 = new Mobile();

        System.out.print("Enter the company name : ");
        mb1.company = sc.nextLine();
        System.out.print("Enter the ram of mobile : ");
        mb1.ram = sc.nextInt();
        System.out.print("Enter the storage of mobile : ");
        mb1.stroage = sc.nextInt();

        Mobile mb2 = new Mobile();

        System.out.print("Enter the 2nd mobile company name : ");
        mb2.company = sc.next();

        System.out.print("Enter the 2nd mobile ram : ");
        mb2.ram = sc.nextInt();

        System.out.print("Enter the storage of 2nd mobile : ");
        mb2.stroage = sc.nextInt();

        mb1.data();
        mb2.data();
    }
}
