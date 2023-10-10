import java.util.Scanner;

public class javamatematica1  {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Escreva o valor de a: ");
        double a = Scanner.nextDouble();

        System.out.println("Escreva o valor de b: ");
        double b = Scanner.nextDouble();

        System.out.println("Escreva o valor de c: ");
        double c = Scanner.nextDouble();

        double delta = b * b - 4 * (a * c);

        if (delta < a) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real:" + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("A equação possui duas raizes reais:" + x1 + "é" + x2);
            Scanner.close();
        }
    }
}