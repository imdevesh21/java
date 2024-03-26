import java.util.*;
public class butterfly {

    public static void butterflyPattern(int n) {
        // Print upper half of the butterfly pattern
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower half of the butterfly pattern
        for (int i = n-1 ; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // butterflyPattern(4); // Adjust the size of the pattern as needed
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();
        butterflyPattern(size);
        scanner.close();
    }
}
