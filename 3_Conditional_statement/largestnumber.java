import java.util.*;

public class largestnumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the of a values: ");

    int num1 = input.nextInt();

    System.out.print("Please enter the value of b: ");
    int num2 = input.nextInt();

    int num3;
    

    if (num1 > num2) {
      num3 = num1;
    } else if (num2 > num1) {
      num3 = num2;
    } else {
      System.out.print("Both are equal number");
      num3 = num1;
    }

    System.out.print("Greatest among both is: " + num3);



    input.close();
  }

}
