
import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    public void info() {
        System.out.println("The title of the book is " + this.title);
        System.out.println("The author of the book is " + this.author);
        System.out.println("The price of the book is " + this.price + "$");
    }
}


public class QBook {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        
        b1.title = sc.nextLine();
        b1.author = sc.nextLine();
        b1.price = sc.nextInt();

        b1.info();
    }
}