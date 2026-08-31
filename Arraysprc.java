public class Arraysprc {
    public static void main(String[] args) {
        int arr[] = {9,5,6,7,2,3,1};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Sumof{
    public static void main(String[] args) {
        int arra[] = {1,3,5,7,9,11,13};
        int sum = 0;
        for(int i = 0; i < arra.length; i++){
            sum = sum +  arra[i];
        }
        System.out.println(sum);
    }
}

class AvgArray{
    public static void main(String[] args) {
        int num[] = {20,60,40};
        int sum = 0;
        int l = num.length;
        for(int i = 0; i < num.length; i++)
            sum += num[i]; {

        } 
        System.out.println(sum/l);
    }
}

class Largen{
    public static void main(String[] args) {
        int numbers[] = {2,5,8,99,19};
        int largest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}

class Smallest{
    public static void main(String[] args) {
        int numbers [] = {277,11,65,78,9,};
        int small = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            
            if (numbers[i] < small) {
                small = numbers[i];
            }
        }
        System.out.println(small);
    }
}

