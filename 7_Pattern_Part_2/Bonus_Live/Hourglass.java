import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        // Get number of rows from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Initialize an array to store the input lines
        String[] lines = new String[numRows];

        // Prompt the user to input numbers for each row
        System.out.println("Enter the numbers separated by spaces for each row:");
        for (int i = 0; i < numRows; i++) {
            lines[i] = scanner.nextLine();
        }
        scanner.close();

        // Print upper half of hourglass
        for (int i = 0; i < numRows / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Print the numbers
            System.out.println(lines[i]);
        }

        // Print middle line
        System.out.println(lines[numRows / 2]);

        // Print lower half of hourglass
        for (int i = numRows / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Print the numbers
            System.out.println(lines[i]);
        }
    }
}
