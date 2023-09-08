import java.util.Scanner;

public class Programa24 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("\n| Conversão de Dinheiro em Moedas Estrangeiras |\n");

        System.out.print("\nDigite a quantidade de dinheiro em reais: ");
        double dinheiroEmReais = ent.nextDouble();

        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;

        double dinheiroEmDolares = dinheiroEmReais / cotacaoDolar;
        double dinheiroEmMarcoAlemao = dinheiroEmReais / cotacaoMarcoAlemao;
        double dinheiroEmLibraEsterlina = dinheiroEmReais / cotacaoLibraEsterlina;

        System.out.print("\nValor em dólares: $" + dinheiroEmDolares);
        System.out.print("\nValor em marco alemão: " + dinheiroEmMarcoAlemao + " DM");
        System.out.print("\nValor em libra esterlina: £" + dinheiroEmLibraEsterlina);

        System.exit(0);
    }
}
