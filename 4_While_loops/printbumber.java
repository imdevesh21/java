import java.util.*;
public class printbumber {

  public static void main(String[] args) {
    

  //  int counter = 0;

  //  while(counter <= 10){
  //   System.out.print(counter+" " );
  //   counter++;
  //  }

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number:" );

    int range = input.nextInt();
    int counter = 1;

    while(counter <= range){
      System.out.println(counter+" " );
      counter++;
    }
    System.out.println();


  }
  
}
