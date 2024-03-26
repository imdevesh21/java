import java.util.*;
public class questionthree {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the cost of pencil: ");
    float pen = input.nextFloat();

    System.out.println("Enter the value of ball pen: ");
    float ball = input.nextFloat();

    System.out.println("Enter the value of eraser:");
    float eraser = input.nextFloat();

    float total = pen+ball+eraser;

    System.out.println(total);


  }
  
}
