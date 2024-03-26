import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your income:");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Tax on income $" + income + " is $" + tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0.0;

        // if (income <= 0) {
        //     // No tax for incomes less than or equal to 0
        //     tax = 0.0;
        // } else if (income <= 9875) {
        //     // 10% tax bracket
        //     tax = income * 0.1;
        // } else if (income <= 40125) {
        //     // 12% tax bracket
        //     tax = 987.5 + (income - 9875) * 0.12;
        // } else if (income <= 85525) {
        //     // 22% tax bracket
        //     tax = 4617.5 + (income - 40125) * 0.22;
        // } else if (income <= 163300) {
        //     // 24% tax bracket
        //     tax = 14605.5 + (income - 85525) * 0.24;
        // } else if (income <= 207350) {
        //     // 32% tax bracket
        //     tax = 33271.5 + (income - 163300) * 0.32;
        // } else if (income <= 518400) {
        //     // 35% tax bracket
        //     tax = 47367.5 + (income - 207350) * 0.35;
        // } else {
        //     // 37% tax bracket
        //     tax = 156235 + (income - 518400) * 0.37;
        // }

        // return tax;

          // Define tax brackets and their corresponding tax rates
        double[] brackets = {9875, 40125, 85525, 163300, 207350, 518400}; // Upper limits of each tax bracket
        double[] rates = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37}; // Tax rates for each tax bracket
        double[] bracketTaxes = {0, 987.5, 4617.5, 14605.5, 33271.5, 47367.5, 156235}; // Tax already calculated for each bracket

        for (int i = 0; i < brackets.length; i++) {
            if (income <= brackets[i]) {
                // Calculate tax based on the current tax bracket
                tax = bracketTaxes[i] + (income - (i > 0 ? brackets[i - 1] : 0)) * rates[i];
                break;
            }
        }

        return tax;
    }
}
