import java.util.Scanner;

class Books {
    String title;

    public void display() {
        System.out.println("The title of the Book is - " + this.title);
    }
}

public class Q5BookObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Books books[] = new Books[5];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Books();

            System.out.print("Enter title of Book " + (i + 1) + ": ");
            books[i].title = sc.nextLine();
        }

        System.out.println("\nBook Titles:");

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }


    }
}
