import java.util.Scanner;

class Person{
    private int age;

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age = " +  age);
    }
    public int getAge() {
        return age;
    }
}

public class EncapsulationPerson{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        p.setAge(sc.nextInt());
        p.getAge();
    }
}