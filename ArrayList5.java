import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        java.util.ArrayList<Integer> numbers =  new java.util.ArrayList<>();
        int j = 1;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + j + " number : ");
            numbers.add(sc.nextInt());
            j++;
        }
        int largest = numbers.get(0);
        for (int i = 0; i < size; i++) {
            if(numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }
        Integer largest2 = null;

        for(int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if(current < largest &&
                (largest2 == null || current > largest2)) {
                    largest2 = current;
                }
            }

        if(largest2 == null) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second largest = " + largest2);
        }
        System.out.println("ArrayList = "+ numbers);
        System.out.println("largest = " + largest);
        System.out.println("Second largest = " + largest2);
    }
}