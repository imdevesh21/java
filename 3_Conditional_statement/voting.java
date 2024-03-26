import java.util.*;
public class voting {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your age:");

    int age = input.nextInt();

    if (age >= 18) {
      System.out.println("Adult : vote, drive");
    }
    if (age > 13 && age < 16) {
      System.out.println("Teenager: smoke chaprigiri ");
    } else if(age < 13){
      System.out.println("not adult");
    }
  }
}