
import java.util.*;

public class fever {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your body temperature: ");
        double temp = sc.nextDouble();

        sc.close();

        if (temp > 100) {
            System.out.println("Your have a fever");
        } else if (temp > 98.6 && temp < 100) {
            System.out.println("Your body temp is slightly high");
        } else if (temp > 95 && temp < 98.6) {
            System.out.println("Your body temp is Normal");
        } else {
            System.out.println("Your body temperature is lower than normal. Please consult a doctor.");
        }

    }
}
