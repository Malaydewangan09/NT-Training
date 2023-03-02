import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        double compoundInterest = principal * Math.pow((1 + (rate/100)), time) - principal;
        return compoundInterest;
    }
}
