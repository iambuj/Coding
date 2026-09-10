
import java.util.Scanner;

class Circle {
    int radius;
    public void Circumference() {
        int circum = 2 * 22 * (radius) / 7;
        System.out.println("The circumference of circle = " + circum);
    }
}

public class QCircumference {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();

        System.out.print("Enter the radius : ");
        c1.radius = sc.nextInt();

        c1.Circumference();
    }
}