
import java.util.Scanner;

public class PracArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num[] = {23,27,88,93,11};
        System.out.print("Enter the number to find : ");
        int x = sc.nextInt();
        for (int i = 0; i < Num.length; i++) {
            if(x == Num[i]) {
                System.out.println(x + " Founded at " + i + " index number");
            }
        }
    }
}

class Size{
    public static void main(String[] args) {
        int series[] = {1,3,7,7,77,9,3,2,4};
        int count = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

class Odd{
    public static void main(String[] args) {
        int num[] = {1,2,3,5,7,9,11};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] % 2 != 0){ 
                count++;
            }
        }
        System.out.println(count);
    }
}
class Negative{
    public static void main(String[] args) {
        int numbs[] = {1,3,-5,-2,-99,-56};
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] < 0) {
                System.out.print(numbs[i] + " ");
            }
        }
    }
}