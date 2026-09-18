
import java.util.Scanner;

public class TwoDArrays2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Num = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the number : ");
                Num[i][j] = sc.nextInt();
            }
            System.out.println(r * c);
        }

    }
}
