public class Strings3 {
    public static void main(String[] args) {
        int count = 0;
        String word = "Hello World I'm Learning Java";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}