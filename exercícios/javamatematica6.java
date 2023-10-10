import java.util.Scanner;

public class javamatematica6 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double baseMaior, baseMenor, altura;

        System.out.println("Digite a base maior do trapézio:");
        baseMaior = Scanner.nextDouble();

        System.out.println("Digite a base menor do trapézio:");
        baseMenor = Scanner.nextDouble();

        System.out.println("Digite a altura do trapézio:");
        altura = Scanner.nextDouble();

        double area = (baseMaior + baseMenor) * altura / 2;

        System.out.println("A área do trapézio é: " + area);
        Scanner.close();
    }
}