import java.util.Scanner;

public class javaexercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = 3.14159 * raio * raio;

        double perimetro = 2 * 3.14159 * raio;

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

        scanner.close();
    }
}
