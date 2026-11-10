
import java.util.Scanner;

public class LoginEx {
    static void login(String pass) throws IllegalArgumentException{
        if(pass.length() < 8) {
            throw new ArithmeticException("Weak Password");
        }
        System.out.println("Login Successful");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password : ");
        String pass = sc.nextLine();
        try {
            login(pass);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
