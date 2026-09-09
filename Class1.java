
import java.util.Scanner;

class Result {
    
    String topper;
    int passed;
    int failed;

    public void info() {
        System.out.println(this.topper);
        System.out.println(this.passed);
        System.out.println(this.failed);
    }
}

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r1 = new Result();

        r1.topper = sc.nextLine();
        r1.passed = sc.nextInt();
        r1.failed = sc.nextInt();

        Result r2 = new Result();

        r2.topper = sc.next();
        r2.passed = sc.nextInt();
        r2.failed = sc.nextInt();

        r1.info();
        r2.info();
    }
}