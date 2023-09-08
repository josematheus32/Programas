import java.util.Scanner;

public class Programa19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\n|Sistema de Iluminação|\n");

        System.out.print("\nDigite a Largura do Cômodo: ");
        double largura = input.nextDouble();

        System.out.print("\nDigite o Comprimento do Cômodo: ");
        double comprimento = input.nextDouble();

        double area = largura * comprimento;

        double iluminacao = area * 18;

        System.out.println("\nA Área do Cômodo é: " + area);
        System.out.println("\nA Potência de Iluminação Necessária é: "+ iluminacao);

        System.exit(0);
    }
}
