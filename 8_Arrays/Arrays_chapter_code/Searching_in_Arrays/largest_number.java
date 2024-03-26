public class largest_number {

    public static int large_number(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if(smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest value is: "+ smallest);
        return largest;
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("largest value is: " + large_number(number));

    }

}