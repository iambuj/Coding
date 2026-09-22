import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int c = 0;
        int arr[] = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++) {
            int x = arr[i];
            c += x;
        }
        System.out.println(c);
    }
}
