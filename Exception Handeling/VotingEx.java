
import java.util.Scanner;

public class VotingEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your age : ");
            int age = sc.nextInt();
            if(age >= 18) {
                System.out.println("Can Vote");
            }
        } catch (Exception e) {
            System.out.println("Cannot vote...");
        }
        finally{
            System.out.println("Program Ended...");
        }
    }
}
