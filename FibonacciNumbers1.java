public class FibonacciNumbers1 {
    public int fibo(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        FibonacciNumbers1 f = new FibonacciNumbers1();
        System.out.println(f.fibo(50));
    }
}
