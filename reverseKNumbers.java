import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKElementsInQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Enter the number of elements:);
        int n = scanner.nextInt();

        // create a queue to store the elements
        Queue<Integer> queue = new ArrayDeque<>();

        // read the elements into the queue
        System.out.println(Enter the elements:);
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.add(element);
        }

        System.out.println(Enter the value of k:);
        int k = scanner.nextInt();

        // create a stack to store the first k elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // add the elements from the stack back into the queue
            queue.add(stack.pop());
        }

        // add the remaining elements back into the queue
        for (int i = 0; i < n - k; i++) {
            queue.add(queue.remove());
        }

        // print the reversed queue
        System.out.println(Reversed Queue:);
        for (int element : queue) {
            System.out.print(element +  );
        }
    }
}
