
import java.util.Scanner;

public class Strings4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        System.out.println(count);
    }
}

class Cons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count2 = 0;
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            switch(word.charAt(i)) {
                case 'a' , 'e' , 'i' , 'o' , 'u' -> count2++;
            }
        }
        System.out.println(26 - count2);
    }
}

class Space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count2 = 0;
        String word = sc.nextLine();
        
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' ') {
                count++;
            }
            else if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i ) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count2++;
            }
        }
        System.out.println("number of spaces in word is = " + count);
        System.out.println("number of vowels in word is = " + count2);
        System.out.println("number of consonants in word is = " + (26 - count2));
    }
}