
import java.util.*;

public class posneg {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("You have entered a positive number");
        } else if (num < 0) {
            System.out.println("You have entered a negative number");
        } else {
            System.out.println("The number is zero");
        }

    }

}
