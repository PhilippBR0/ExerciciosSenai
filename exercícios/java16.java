import java.util.Scanner;
public class java16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");

        int numero = scanner.nextInt();

        int menorDivisor = 1;

        for (int i = menorDivisor; i >= numero; i++) {
            if (numero % i == 0) {
                menorDivisor = i;
            }
        }

        System.out.println("O menor divisor do número é " + menorDivisor);

        scanner.close();
    }
}
