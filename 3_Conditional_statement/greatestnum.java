
import java.util.*;

public class greatestnum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number: ");

        double num1 = input.nextDouble();

        double num2 = input.nextDouble();

        double num3 = input.nextDouble();

        double greatest = findGreatest(num1, num2, num3);

        if (greatest != Double.MIN_VALUE) {
            System.out.println("The greatest number is: " + greatest);
        } else {
            System.out.println("All number are equal");
        }

        input.close();
    }

    public static double findGreatest(double num1, double num2, double num3) {

        double greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num1 == num2 && num2 == num3) {
            return Double.MIN_VALUE;
        }

        return greatest;
    }
}
