import java.util.Scanner;

public class PracString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        String x = Name.toUpperCase();

        System.out.println(x);
    }
}

class Low{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String a = word.toLowerCase();
        System.out.println(a);
    }
}

class CountW{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String n = sc.nextLine();
        System.out.print("Enter the word to count : ");
        char x = sc.nextLine().charAt(0);
        int count = 0;

        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Present{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  String a = sc.nextLine();  System.out.print("Enter the char to check : "); int count = 0;
        char x = sc.next().charAt(0);

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == x) {
                System.out.println("Yes It is present in the string at " + i);
                break;
            }
        }
    }
}

class Most{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}

class Ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.println(a.length());
    }
}

class Fc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(a.charAt(0));
    }
}

class Lc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.charAt(a.length() - 1));
    }
}

class Up{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(a.toUpperCase());
    }
}

class Lcase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.toLowerCase());
    }
}

class Vow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        System.out.println(count);
    }
}

class Conso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int Count = 0;

        for (int i = 0; i < a.length(); i++) {
            switch(a.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> Count++;
            }
        }
        System.out.println("Number of consonants " + (26-Count));
    }
}

class Sp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int cont = 0;

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') {
                cont++;
            }
        }
        System.out.println(cont);
    }
}

class Cd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            switch(a.charAt(i)) {
                case '9','8','7','6','5','4','3','2','1','0' -> count++;
            }
        }
        System.out.println(count);
    }
}

class Spe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            switch(a.charAt(i)) {
                case '!','(','*','&','^','%','$','#','@',')','_','+','-','=','?','>','<','~','`',':',';','/',',','.' -> count++;
            }
        }
        System.out.println(count);
    }
}