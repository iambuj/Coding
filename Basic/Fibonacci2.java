package Basic;
public class Fibonacci2 {
    public int fiboonaccinum2(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        for(int i = 2; i<= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        Fibonacci2 f = new Fibonacci2();
        System.out.println(f.fiboonaccinum2(100000));
    }
}
