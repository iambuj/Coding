

public class Bitmani {
    public static void main(String[] args) {
        int n = 2;
        int pos = 2;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0) {
            System.out.println("bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}


class Setb{
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newn = bitmask | n;
        System.out.println(newn);
    }
}

class Clr{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<2;

        int x = ~(bitmask);
        int newn = x & n;
        System.out.println(newn); 

    }
}