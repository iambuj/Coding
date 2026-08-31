public class PracArray2 {
    public static void main(String[] args) {
        int number[] = {1, 2, 33, 4};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {

            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            }
            else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest = number[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}