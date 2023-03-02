import java.util.Scanner;

public class HighestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int highest = findHighestNumber(num1, num2, num3);
        System.out.println("The highest number is: " + highest);
    }

    public static int findHighestNumber(int num1, int num2, int num3) {
        int highest = num1;
        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }
        return highest;
    }
}
