import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter the Elements : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Findx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();
        
        int[][] Numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter the Element : ");
                Numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(Numbers[i][j] == x) {
                    System.out.print("x founded at (" + i + "," + j + ")");
                }
            }
            
        }

    }
}