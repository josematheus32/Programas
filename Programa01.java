import java.util.Scanner;

public class Programa01{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Sistema de Subtração|\n");

        System.out.print("\nDigite um número: ");
        double n1 = ent.nextDouble();
        System.out.print("\nDigite outro número: ");
        double n2 = ent.nextDouble();

        double res = (n1-n2);

        System.out.print("\nO Resultado da Subtração "+ n1 +" - "+ n2 +" = "+ res);

        System.exit(0);

    }
}