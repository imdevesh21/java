public class reverse {

  public static void main(String[] args) {

    int n = 436356;

    while(n > 0){
      int lastDigit = n % 10; // last digit
      System.out.print(lastDigit+" ");
      n/=10;
    }
    System.out.println();
     
  }
  
}
