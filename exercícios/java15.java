import java.util.Scanner;
public class java15 {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        int maiorDivisor = 1;

        for (int i = maiorDivisor; i <= numero; i++) {
            if (numero % i == 0) {
                maiorDivisor = i;
            }
        }

        System.out.println("O maior divisor do número é " + maiorDivisor);

        scanner.close();
    }
}
