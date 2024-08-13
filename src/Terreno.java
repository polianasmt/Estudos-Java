import java.util.Scanner;
import java.util.Locale;

public class Terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float largura, comprimento, valor, area, preco;

        System.out.print("Insira a largura: ");
        largura = Float.parseFloat(input.nextLine());

        System.out.print("Insira o comprimento: ");
        comprimento = Float.parseFloat(input.nextLine());

        System.out.print("Insira o valor do metro quadrado: ");
        valor = Float.parseFloat(input.nextLine());

        area = largura * comprimento;
        preco = area * valor;

        System.out.printf("Area do terreno: %.2f\n", area);
        System.out.printf("Preço do terreno: %.2f\n", preco);

        }
}

