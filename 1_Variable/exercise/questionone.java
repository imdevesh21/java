import java.util.*;
public class questionone {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    

    System.out.print("please enter the value of A: ");
    int a = sc.nextInt();

    
    System.out.print("please enter the value of B: ");
    int b = sc.nextInt();
    
    System.out.print("please enter the value of C: ");
    int c = sc.nextInt();

    int avg = (a+b+c)/3;

    System.out.print("Sum of enter no is: " + avg);


  }

  
}

