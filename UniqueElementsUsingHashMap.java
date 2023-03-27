import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElementsUsingHashMap {
    public static void main(String[] args) {
        // Define the input list with duplicate elements
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        
        // Define a HashMap to store unique elements
        HashMap<Integer, Integer> uniqueMap = new HashMap<Integer, Integer>();
        
        // Loop through each element in the input list
        for(int i=0; i<inputList.size(); i++) {
            int element = inputList.get(i);
            // Add the element to the unique map if it is not already present
                uniqueMap.put(element, 1);
            }
        }
        
        // Create an ArrayList from the unique keys of the map
        ArrayList<Integer> uniqueList = new ArrayList<Integer>(uniqueMap.keySet());
        
        // Print the unique list
        System.out.println(Input List:  + inputList);
        System.out.println(Unique List:  + uniqueList);
    }
}

