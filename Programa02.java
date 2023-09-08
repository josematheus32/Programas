import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa02{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Sistema de Multiplicação por Três Números|");

        System.out.print("\nDigite um Número: ");
        double n1 = ent.nextDouble();
        System.out.print("\nDigite outro Número: ");
        double n2 = ent.nextDouble();
        System.out.print("\nDigite outro Número: ");
        double n3 = ent.nextDouble();

        double res = (n1*n2*n3);

        System.out.println("\nO Resultado da Multiplicação "+ n1 +" x "+ n2 +" x "+ n3 +" = "+ res);

        System.exit(0);
    }
}