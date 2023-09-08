import java.util.Scanner;

public class Programa25 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n| Conversão de Hora para Minutos e Segundos |\n");

        System.out.print("\nDigite a hora (de 0 a 23): ");
        int hora = ent.nextInt();

        System.out.print("\nDigite os minutos (de 0 a 59): ");
        int minutos = ent.nextInt();

        int minutosConvertidos = hora * 60;
        int minutosTotais = minutosConvertidos + minutos;
        int segundosTotais = minutos * 60;

        System.out.print("\nA hora digitada convertida em minutos: " + minutosConvertidos + " minutos");
        System.out.print("\nO total dos minutos: " + minutosTotais + " minutos");
        System.out.print("\nO total dos minutos convertidos em segundos: " + segundosTotais + " segundos");

        System.exit(0);
    }
}
