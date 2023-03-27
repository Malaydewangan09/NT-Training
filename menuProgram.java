import java.util.HashSet;
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        HashSet<Integer> elementsSet = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println(Enter your choice:);
            System.out.println(1. Add);
            System.out.println(2. Remove);
            System.out.println(3. Display Elements);
            System.out.println(4. Exit);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(Enter the element to add:);
                    int element = scanner.nextInt();
                    elementsSet.add(element);
                    break;
                case 2:
                    System.out.println(Enter the element to remove:);
                    int removeElement = scanner.nextInt();
                    if (elementsSet.remove(removeElement)) {
                        System.out.println(removeElement +  removed successfully);
                    } else {
                        System.out.println(removeElement +  not found in the set);
                    }
                    break;
                case 3:
                    if (elementsSet.isEmpty()) {
                        System.out.println(Set is empty!);
                    } else {
                        System.out.println(Elements in the set:);
                        for (int elementInSet : elementsSet) {
                            System.out.println(elementInSet);
                        }
                    }
                    break;
                case 4:
                    System.out.println(Exiting...);
                    break;
                default:
                    System.out.println(Invalid choice!);
            }
        }
        scanner.close();
    }
}

