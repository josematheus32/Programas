import java.util.Scanner;

public class Programa08{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Conversor de Quilos em Gramas|\n");
        System.out.print("\nDigite seu Peso em Quilos: ");
        double quilo = ent.nextDouble();

        double grama = (quilo*1000);

        System.out.print("\nA Conversão ficou: "+ grama +" g");

        System.exit(0);
    }
}