import java.util.Scanner;

public class FebonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int f[] = new int[n];
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                f[i] = 0;
            }
            else if(i == 1) {
                f[i] = 1;
            }
            else{
                f[i] = f[i - 1] + f[i - 2];
            }
            System.out.print(f[i] + " ");
        }
        System.out.println();
    }
}