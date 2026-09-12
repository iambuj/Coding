
import java.util.Scanner;

class LibraryBook{
        String title;

        Boolean issued;

        public void returnBook() {
            if(issued == true) {
                System.out.println("The " + this.title + " book has been issued ");
            }
            else{
                System.out.println("The " + this.title + " book has been returned ");
                
            }
        }
}

public class QLibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        LibraryBook l1 = new LibraryBook();

        l1.title = sc.nextLine();
        l1.issued = sc.nextBoolean();
        l1.returnBook();
    }
}
