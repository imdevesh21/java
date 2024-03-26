
import java.util.*;

public class syntaxwithparameters {

    public static int sumOfNumbers(int num1, int num2) {   //parameters or Formal Parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfNumbers(a, b);  //aeguments or actual parameters
        System.out.println("Sum is:" + sum);

    }
}
