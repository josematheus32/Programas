import java.util.Scanner;

public class Programa03{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Sistema de Divisão|\n");
        System.out.print("\nDigite um Número: ");
        double n1 = ent.nextDouble();

        double n2;

        do {
            System.out.print("\nDigite outro Número: ");
            n2 = ent.nextDouble();

            if (n2 == 0) {
                System.out.print("\nNão é Possível Dividir por Zero!\n");
            }
        } while (n2 == 0);

        double res = (n1 / n2);

        System.out.print("\nO Resultado da Divisão " + n1 + " / "+ n2 +" = "+ res);

        System.exit(0);
    }
}