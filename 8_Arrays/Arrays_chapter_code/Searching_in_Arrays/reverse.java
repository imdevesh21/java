public class reverse {

  public static void reverse(int[] numbers){
    int start = 0, end = numbers.length - 1;
    while(start < end){
      int temp = numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    reverse(numbers);
    System.out.println("Reversed array: ");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
  }
}