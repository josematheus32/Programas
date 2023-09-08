import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa05{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.print("\n|Bem Vindo(a) a Tech Games|\n");
        System.out.print("\nInsira seu Nome: ");
        String nome = ent.nextLine();
        System.out.print("\nOlá "+ nome +" como está!");
        System.out.print("\n\nPromoção: A Cada Produto Comprado Você terá 10% de Desconto!\n");
        System.out.print("\nDigite o Preço do seu Produto: ");
        double preco = ent.nextDouble();

        double novopreco = preco - (preco*10/100);

        System.out.print("\nSeu Produto com Desconto ficou: "+ deci.format(novopreco));

        System.exit(0);
    }
}