import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Enter a string:);
        String inputString = scanner.nextLine();

        // create a hashmap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

        // iterate over the characters in the input string
        for (char c : inputString.toCharArray()) {
            // check if the character is a digit or an alphabet
            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                // update the frequency of the character in the hashmap
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(" + entry.getKey() + " :  + entry.getValue());
        }
    }
}

