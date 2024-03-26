import java.util.*;
public class statementbreak {
  public static void main(String[] args) {
    
    // for(int i = 0; i <= 5; i++) {
    //   if(i == 3){
    //     break;
    //   }
    //   System.out.println(i);
    // }
    // System.out.println("out of loop");

    Scanner input = new Scanner(System.in);

    do{
      System.out.println("Enter your number");
      int n = input.nextInt();

      if(n % 10 == 0) {
        break;
      }
      System.out.println(n);
    } while (true);
  }
}
