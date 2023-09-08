import java.util.Scanner;

public class Programa23 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n| Cálculo do Terceiro Ângulo de um Triângulo |\n");

        System.out.print("\nDigite a medida do primeiro ângulo: ");
        double primeiroAngulo = ent.nextDouble();

        System.out.print("\nDigite a medida do segundo ângulo: ");
        double segundoAngulo = ent.nextDouble();

        double terceiroAngulo = 180 - (primeiroAngulo + segundoAngulo);

        if (terceiroAngulo > 0) {
            System.out.print("\nA medida do terceiro ângulo é: " + terceiroAngulo);
        } else {
            System.out.print("\nOs ângulos fornecidos não formam um triângulo válido.");
        }

        System.exit(0);
    }
}
