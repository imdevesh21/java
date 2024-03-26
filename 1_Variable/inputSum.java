import java.util.*;
public class inputSum {

  public static void main(String[] args) {
    System.out.println("Enter the value of a");
    Scanner  input = new Scanner(System.in);
    int a = input.nextInt();
    System.out.println("Enter the value of b");
    
    int b = input.nextInt();

    int sum = a * b;

    System.out.println("sum of two number is " + sum);
  }
  
}
