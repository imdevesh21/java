
import java.util.*;

public class primenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }

        sc.close();

    }

    public static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

