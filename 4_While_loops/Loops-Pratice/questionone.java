
import java.util.*;

public class questionone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //imput the upper limit from the user
        System.out.println("Enter the upper limit");
        int n = input.nextInt();

        //initialize an array to keep track on the number
        boolean[] isComposite = new boolean[n + 1];

        //iterate through numbers starting from 2(the first prime number)
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                // Mark multiples of prime numbers as composite
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        //print prime numbers
        System.out.println("Prime number up to" + n + ":");

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                System.out.println(i + " ");
            }
        }
        input.close();
    }
}
