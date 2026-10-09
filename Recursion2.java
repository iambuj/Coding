public class Recursion2 {
    public static void PrintNum(int a) {
        if(a == 6) {
            return;
        }

        System.out.println(a);
        PrintNum(a+1);
    }
    public static void main(String[] args) {
        int a = 1;
        PrintNum(a);
    }
}
