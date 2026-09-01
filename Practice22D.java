
import java.util.Scanner;

// 

public class Practice22D {
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
        System.out.print("The elements of first row is = " );
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[0][j] + " ");
            }
            System.out.println();
        }
    }

// 

class Lastr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the column : ");
        int c = sc.nextInt();

        int[][] number = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the El : ");
                number[i][j] = sc.nextInt();
            }
        }
        System.out.print("The elements of last row of matrix is = ");
        for (int j = 0; j < c; j++) {
            System.out.print(number[r - 1][j] + " ");
        }
    }
}

class FirstC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the col : ");
        int c = sc.nextInt();

        int num[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the el : ");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(num[i][0] + " ");
        }
    }
}

class LastC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the col : ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the el : ");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(num[i][c - 1] + " ");
        }
    }
}

class Search{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the col : ");
        int c = sc.nextInt();
        int num[][] = new int[r][c];
        System.out.print("Enter the number to find : ");
            int x = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the el : ");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(num[i][j] == x) {
                    System.out.println("x founded at (" + i + "," + j + ")");
                }
            }
        }
    }
}