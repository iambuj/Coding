import java.util.Scanner;

class Shape{

    public void showshape() {
        System.out.println("This is the shape...");
    }
}

class Rectange extends Shape{
    int len;
    int bdth;

    public void area() {
        System.out.println("The area of the rectange is = " + (len*bdth));
    }
}

public class InhertanceShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectange s1 = new Rectange();

        s1.len = sc.nextInt();
        s1.bdth = sc.nextInt();
        s1.showshape();
        s1.area();
    }
}
