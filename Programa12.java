import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa12 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0.0");

        System.out.print("\n|Veja a Quantidade de Salários Mínimos que Você Recebe|\n");
        System.out.print("\nDigite o Valor do Salário Mínimo Atual: ");
        double salariom = ent.nextDouble();
        System.out.print("\nDigite o Valor do Seu Salário: ");
        double sal = ent.nextDouble();

        double quantidade = (sal/salariom);

        System.out.print("\nA Quantidade de Salário Mínimo que Você Recebe é: "+ deci.format(quantidade));

        System.exit(0);
    }
}
