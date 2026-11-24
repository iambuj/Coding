package Practice;

class SumOfN{
    public int sumOfNumbers(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
public class Sum1 {
    public static void main(String[] args) {
        SumOfN s = new SumOfN();
        int n = 7;
        System.out.println(s.sumOfNumbers(n));
    }
}