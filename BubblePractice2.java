
import java.util.Scanner;

public class BubblePractice2 {

    public static void PrintBubble(int[] Bubble) {
        for (int i = 0; i < Bubble.length; i++) {
            System.out.print(Bubble[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int a = sc.nextInt();
        int Bubble[] = new int[a];
        for (int i = 0; i < Bubble.length; i++) {
            System.out.print("Enter the element : ");
            Bubble[i] = sc.nextInt();
        }

        for (int i = 0; i < Bubble.length-1; i++) {
            for (int j = 0; j < Bubble.length-i-1; j++) {
                if(Bubble[j] < Bubble[j+1] ) {
                    //swap-----
                    int temp = Bubble[j];
                    Bubble[j] = Bubble[j+1];
                    Bubble[j+1] = temp;
                }
            }
        }
        PrintBubble(Bubble);
    }
}
