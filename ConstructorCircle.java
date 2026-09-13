import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("The area of the circle is = " + result);
    }

}

public class ConstructorCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle(sc.nextDouble());
        c1.area();
    }
}
