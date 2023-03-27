import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> elementsList = new ArrayList<Integer>();
        HashSet<Integer> uniqueElements = new HashSet<Integer>();

        // add elements to the list
        elementsList.add(1);
        elementsList.add(2);
        elementsList.add(1);
        elementsList.add(2);
        elementsList.add(1);
        elementsList.add(2);
        elementsList.add(1);
        elementsList.add(2);
        elementsList.add(1);

        // store unique elements in a HashSet
        for (int element : elementsList) {
            uniqueElements.add(element);
        }

        // create a new ArrayList with unique elements
        ArrayList<Integer> uniqueList = new ArrayList<Integer>(uniqueElements);

        // print the unique elements list
        System.out.println(List:  + elementsList);
        System.out.println(Unique Elements:  + uniqueList);
    }
}

