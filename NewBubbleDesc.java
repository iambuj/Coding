import java.util.*;

public class NewBubbleDesc {
    public static void Descending(int des[]) {
        System.out.print("Descending Order : ");
        System.out.print("[ ");
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i] + " , ");
            
        }
        System.out.print(" ]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int des[] = new int[n];
        for(int i = 0; i < des.length; i++) {
            System.out.print("Enter the Element : ");
            int el = sc.nextInt();
            des[i] = el;
        }
        System.out.println("Before Sorting : ");
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < des.length-1; i++) {
            for (int j = 0; j < des.length-i-1; j++) {
                if(des[j] < des[j+1]) {
                    //Swap--
                    int tem = des[j];
                    des[j] = des[j+1];
                    des[j+1] = tem;
                }
            }
        }
        Descending(des);
    }
}
