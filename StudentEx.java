
import java.util.Scanner;

public class StudentEx {
    static void checkMarks(int marks) throws ArithmeticException{
        if(marks < 0 || marks > 100){
            throw new ArithmeticException("Invalid Marks");
        }
        System.out.println("marks = " + marks );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();
        try {
            checkMarks(marks);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
