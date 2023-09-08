import java.util.Scanner;

public class Programa22 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n| Cálculo do Número de Diagonais de um Polígono Convexo |\n");

        System.out.print("\nDigite o número de lados do polígono: ");
        int n = ent.nextInt();

        double nd = (n * (n - 3) / 2.0);

        if (n >= 3) {
            System.out.print("\nO número de diagonais do polígono é: " + nd);
        } else {
            System.out.print("\nUm polígono com menos de 3 lados não tem diagonais.");
        }

        System.exit(0);
    }
}
