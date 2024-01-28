public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = scanner.nextInt();
        System.out.println("Enter the step count: ");
        int k = scanner.nextInt();
        System.out.println("The chosen place is " + josephus(n, k));
    }