import java.util.Scanner;

class Volume{
    int side;
    int length;
    int width;
    int height;

    public void display(int side) {
        int v = side*side*side;
        System.out.println("The volume of cube is = " + v);
    }

    public void display(int length , int width , int height) {
        int vo = length*width*height;
        System.out.println("The volume of the cuboid is = " + vo);
    }
}

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Volume v1 = new Volume();
        System.out.println("Enter the side of the cube : ");
        v1.side = sc.nextInt();
        v1.length = sc.nextInt();
        v1.width = sc.nextInt();
        v1.height = sc.nextInt();

        v1.display(v1.side);
        v1.display(v1.length , v1.width , v1.height);
    }
}
