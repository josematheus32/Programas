import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Área do Quadrado|\n");
        System.out.print("\nDigite o Tamanho do Lado: ");
        double lado = ent.nextDouble();

        double area = (lado*lado);

        System.out.print("\nA Área do Quadrado é: "+ area);

        System.exit(0);
    }
}
