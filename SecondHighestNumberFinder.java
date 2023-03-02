public class SecondHighestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 10, 3 };
        int secondHighest = findSecondHighestNumber(numbers);
        System.out.println("The second highest number in the array is: " + secondHighest);
    }

    public static int findSecondHighestNumber(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        return secondHighest;
    }
}
