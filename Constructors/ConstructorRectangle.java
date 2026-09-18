
import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    Rectangle(int length , int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        int area = length*breadth;
        System.out.println("The area of recangle is = " + area );
    }
}

public class ConstructorRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle(sc.nextInt(), sc.nextInt());
        r1.area();
    }
}
