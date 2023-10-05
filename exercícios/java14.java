import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);

        scanner.close();
    }
}
