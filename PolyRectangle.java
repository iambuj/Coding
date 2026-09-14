
import java.util.Scanner;

class Areas {
    int side;
    int length;
    int width;

    public void area(int side) {
        int areasq = (side*side);
        System.out.println("The area of the square is = " + areasq);
    }

    public void area(int length , int width) {
        int arearec = length*width;
        System.out.println("the area of the rectangle is = " + arearec);
    }
}

public class PolyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        Areas a1= new Areas();
        a1.side = sc.nextInt();
        a1.length = sc.nextInt();
        a1.width = sc.nextInt();
        a1.area(a1.side);

        a1.area(a1.length, a1.width);
    }
}
