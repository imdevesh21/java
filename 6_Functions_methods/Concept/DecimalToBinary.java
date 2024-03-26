public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 7; // Change the decimal number here
        String binaryNumber = decToBin(decimalNumber);
        System.out.println("Binary form of number " + decimalNumber + ": " + binaryNumber);
    }

    public static String decToBin(int n) {
        if (n == 0) {
            return "0"; // Handle edge case when input number is 0
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int rem = n % 2; // Remainder
            binary.append(rem); // Append binary digit to StringBuilder

            n = n / 2;  // Update quotient
        }

        return binary.reverse().toString(); // Reverse and convert StringBuilder to String
    }
}
