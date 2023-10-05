import java.util.Scanner;
public class java24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int segundoNumero = scanner.nextInt();

        int menorNumero = Math.min(primeiroNumero, segundoNumero);

        System.out.println("O menor número é " + menorNumero);

        scanner.close();
    }
}