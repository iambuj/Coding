import java.util.ArrayList;
import java.util.Scanner;

public class Stack4 {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            return list.remove(list.size() - 1);
        }

        public int peek() {
            return list.get(list.size() - 1);
        }

        public void printStack() {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }

        public void search(int search) {
            for (int i = 0; i < list.size(); i++) {
                if (search == list.get(i)) {
                    System.out.print(search + " Founded at " + (list.size() - i) + " index ");
                    return;
                }
            }
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        System.out.print("Enter the size of the Stack : ");
        int size = sc.nextInt();        
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            st.push(sc.nextInt());
        }
        System.out.println("Stack : ");
        st.printStack();
        st.pop();
        System.out.println("Stack After pop : ");
        st.printStack();
        System.out.print("Enter a number to search : ");
        st.search(sc.nextInt());
    }
}
