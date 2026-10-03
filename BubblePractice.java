
import java.util.Scanner;

public class BubblePractice {

    public static void Bubble(int[] Num) {
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int a = sc.nextInt();
        int Num[] = new int[a];
        for (int i = 0; i < Num.length; i++) {
            System.out.print("Enter the elements : ");
            Num[i] = sc.nextInt();
        }

        for (int i = 0; i < Num.length-1; i++) {
            for (int j = 0; j < Num.length-i-1; j++) {
                if(Num[j] < Num[j+1]) {
                    //Swap-----
                    int temp = Num[j];
                    Num[j] = Num[j+1];
                    Num[j+1] = temp;
                }
            }
        }
        Bubble(Num);
    }
}
