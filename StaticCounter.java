import java.util.Scanner;

class Counter{
    static int count = 0;
    
    Counter() {
        count++;
        System.out.println("Count = " + count);
    }
}

public class StaticCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

    }
}