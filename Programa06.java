import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|       Sistema de Comissão        |");
        System.out.print("\n|----------------------------------|");
        System.out.print("\n|  Comissão de 4% Sobre as Vendas  |\n");
        System.out.print("\n\nInforme o seu Salário Fixo: ");
        double fixo = ent.nextDouble();
        System.out.print("\nInforme o Valor de suas Vendas: ");
        double vendas = ent.nextDouble();

        double novosalario = (fixo+(vendas*4/100));

        System.out.print("\nSeu Salário com a Comissão ficou: "+ novosalario);

        System.exit(0);
    }
}
