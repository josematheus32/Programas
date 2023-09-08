import java.util.Scanner;

public class Programa20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n|Sistema de Escada|\n");

        System.out.print("\nDigite o Ângulo em Graus: ");
        double anguloGraus = scanner.nextDouble();

        System.out.print("\nDigite a Distância da Escada Para a Parede em Metros: ");
        double distanciaParede = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double comprimentoEscada = (distanciaParede / Math.cos(anguloRadianos));

        System.out.print("\nO Comprimento da Escada Necessário é: " + comprimentoEscada);

        System.exit(0);
    }
}
