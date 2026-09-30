import java.util.Scanner;

abstract class Bank {
    int principal;
    int time;

    abstract void rateOfInterest();
}

class SBI extends Bank {

    void rateOfInterest() {
        double rate = 0.05;
        double interest = principal * time * rate;

        System.out.println("Rate of Interest = 5%");
        System.out.println("Interest = " + interest);
    }
}

public class Bankk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SBI sbi = new SBI();

        System.out.print("Enter Principal Amount: ");
        sbi.principal = sc.nextInt();

        System.out.print("Enter Time in Years: ");
        sbi.time = sc.nextInt();

        sbi.rateOfInterest();

        sc.close();
    }
}