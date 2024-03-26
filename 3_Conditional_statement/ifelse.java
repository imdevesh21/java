import java.util.*;

public class ifelse{

  public static void main(String[] args) {
    
  //   int a = 2;
  //   int b = 4;

  //   if(a>b){
  //     System.out.println(a);
  //   } else {
  //     System.out.println(b);
  //   }
  // }
  
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter your age");
  int age = input.nextInt();

  if(age > 18){
    System.out.println("eligible");
  } else {
    System.out.println("not eligible");
  }
  }
}