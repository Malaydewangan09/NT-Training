import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        System.out.println("Select a country to convert currency: ");
        System.out.println("1. India");
        System.out.println("2. Japan");
        System.out.println("3. Eurozone");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        double convertedAmount = convertCurrency(usd, choice);
        System.out.println("Converted amount: " + convertedAmount);
    }

    public static double convertCurrency(double usd, int choice) {
        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = usd * 73.21; // Conversion rate for India
                break;
            case 2:
                convertedAmount = usd * 109.61; // Conversion rate for Japan
                break;
            case 3:
                convertedAmount = usd * 0.84; // Conversion rate for Eurozone
                break;
            default:
                System.out.println("Invalid choice");
        }

        return convertedAmount;
    }
}
