import java.util.Scanner;
import java.util.Locale;

public class Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float base, altura;

        System.out.print("Base do retangulo: ");
        base = input.nextFloat();

        System.out.print("Altura do retangulo: ");
        altura = input.nextFloat();

        float area = base * altura;
        float perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt((altura * altura) + (base * base));

        System.out.printf("Area: %.4f\n", area);
        System.out.printf("Perimetro: %.4f\n", perimetro);
        System.out.printf("Diagonal: %.4f\n", diagonal);

    }
}
