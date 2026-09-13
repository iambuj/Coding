import java.util.*;

class Book{
    String title;
    
    Book(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("The title of the book is " + title);
    }
}

public class ConstructorBook{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title : ");
        Book b1 = new Book(sc.nextLine());
        System.out.print("Enter the title : ");
        Book b2 = new Book(sc.nextLine());
        b1.display();
        b2.display();
    }
}