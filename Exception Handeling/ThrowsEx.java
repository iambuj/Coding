public class ThrowsEx {
    static void check() throws ArithmeticException {
        throw new ArithmeticException("Error found...");
    }
    public static void main(String[] args) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
