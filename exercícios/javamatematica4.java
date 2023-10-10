public class javamatematica4 {
    public static void main(String[] args) {
        int cateto1 = 3;
        int cateto2 = 4;

        double hipotenusa = (cateto1 * cateto1) * (cateto2 * cateto2);

        double valorHipotenusa = Math.sqrt(hipotenusa);

        System.out.println("O valor da hipotenusa é " + valorHipotenusa);

    }
}