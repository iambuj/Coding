import java.util.Scanner;
class Book{
    private String title;

    public void setTitle(String title) {
        this.title = title;
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }
}

public class EncapsulationBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        b.setTitle(sc.nextLine());
    }
}
