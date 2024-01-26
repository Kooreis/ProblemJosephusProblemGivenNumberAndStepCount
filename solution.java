```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = scanner.nextInt();
        System.out.println("Enter the step count: ");
        int k = scanner.nextInt();
        System.out.println("The chosen place is " + josephus(n, k));
    }

    static int josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int frontPerson = queue.poll();
                queue.add(frontPerson);
            }
            queue.poll();
        }
        return queue.peek();
    }
}
```