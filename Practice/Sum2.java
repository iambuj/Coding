package Practice;
class SumofNNums{
    public int sumN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumN(n - 1);
    }
}
public class Sum2 {
    public static void main(String[] args) {
        SumofNNums sn = new SumofNNums();
        System.out.println(sn.sumN(3));
    }
}
