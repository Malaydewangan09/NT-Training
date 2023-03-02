import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit PIN number: ");
        String pin = scanner.nextLine();
        if (isValidPin(pin)) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public static boolean isValidPin(String pin) {
        if (pin.length() != 4) {
            return false;
        }
        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
