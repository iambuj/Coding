
import java.util.Scanner;

class Studennt {
    String name;
    String Cousre;
    int age;

    public void Info() {
        System.out.println(this.name);
        System.out.println(this.Cousre);
        System.out.println(this.age);
    }
}

public class Classs2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    Studennt s1 = new Studennt();
    s1.name = sc.nextLine();
    s1.Cousre = sc.nextLine();
    s1.age = sc.nextInt();

    s1.Info();

    }
}
