import java.util.Scanner;

class Circle{
    private int radius;
    private double area;

    public void setRadius(int radius) {
        this.radius = radius;
        if(radius < 0) {
            System.out.println("Enter valid radius ");
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public int getRadius() {
        return radius;
    }

}

public class EncapsulationCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        System.out.print("Enter the radius : ");
        c.setRadius(sc.nextInt());
        c.setArea(3.14 * c.getRadius() * c.getRadius());
        System.out.println("Raidus = "+ c.getRadius());
        System.out.println("Area of the circle = " + c.getArea());
    }
}
