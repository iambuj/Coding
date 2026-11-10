
import java.util.Scanner;

// User se 2 rows aur 2 columns ki matrix lo aur usse print karo. ------------------

public class Practice2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[2][2];
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("Enter the Element :");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Matrix ke sabhi elements ka sum nikalo. -------------------------

class MatrixSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the Element : ");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += num[i][j];
            }
        }

        System.out.print("Sum of Matrix 3 x 3 is = " + sum);
    }
}

// Matrix me total kitne elements hain, print karo. ----------------

class CountArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns : ");
        int c = sc.nextInt();
        int number[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the number : ");
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
            }
        }
        System.out.println("Total number of element is = " + r*c);
    }
}

// Count Even Numbers -------------------

class Evenn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns : ");
        int c = sc.nextInt();
        int count = 0;
        int[][] number = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the element : ");
                number[i][j] = sc.nextInt();

            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(number[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of even numbers in Matrix is = " + count);
    }
}

// Count Odd Numbers -----------------

class Oddn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns : ");
        int c = sc.nextInt();
        int[][] number = new int[r][c];
        int Count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Element : ");
                number[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(number[i][j] % 2 != 0) {
                    Count++;
                }
            }
        }
        System.out.println("Number of odd numbers in Matrix is = " + Count);
    }
}

