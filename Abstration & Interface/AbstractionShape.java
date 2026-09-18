import java.util.Scanner;

abstract class Shape{
    abstract void area();
} 

class Rectangle extends Shape {
    int length;
    int width;
    public void area() {
        System.out.println("Area of rectangle = " + this.length * this.width + "unit");
    }
}

public class AbstractionShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rc = new Rectangle();
        rc.length = sc.nextInt();
        rc.width = sc.nextInt();
        rc.area();
    }
}
