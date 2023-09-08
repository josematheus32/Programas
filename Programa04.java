import java.util.Scanner;

public class Programa04{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Sistema de Média Ponderada por Duas Notas|\n");
        System.out.print("\nDigite sua Primeira Nota: ");
        double nota1 = ent.nextDouble();
        System.out.print("\nDigite sua Segunda Nota: ");
        double nota2 = ent.nextDouble();

        int peso1 = 2;
        int peso2 = 3;

        double media = (nota1*peso1+nota2*peso2) / (peso1+peso2);

        System.out.print("\nA sua Média é: "+ media);

        System.exit(0);
    }
}