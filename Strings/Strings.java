import java.util.*;

class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);
    }
}

// Functions of Strings 
//Concatination -------
class x{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Firstname = sc.nextLine();
        String Lastname = sc.nextLine();
        String Fullname = Firstname + " " + Lastname;
        System.out.println(Fullname);

    }
}

// length function
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fname = sc.nextLine();
        String Lname = sc.nextLine();
        String Flname = Fname + Lname;
        System.out.println(Flname.length());
    }       
}

// CharAt
class B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}


class C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.compareTo(name2) == 0) {
            System.out.println("Equal ");
        }
        else if(name1.compareTo(name2) > 0) {
            System.out.println("Name 1 is greater than Name 2");
        }
        else{
            System.out.println("Name 2 is greater than Name 1");
        }
    }
}

class D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        String name = fullname.substring(0 , 5);
        String fname = fullname.substring(6);
        System.out.println(name);
        System.out.println(fname);
    }
}

