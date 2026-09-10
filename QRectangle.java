
import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public void area() {
        System.out.println("the area of the rectange is = "+ (this.length) * (this.breadth) + "cmsqr");
    }
}

public class QRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Rectangle r1 = new Rectangle();

        System.out.print("Enter the length : ");
        r1.length = sc.nextInt();
        System.out.print("Enter the breadth :");
        r1.breadth = sc.nextInt();

        r1.area();
    }
}
