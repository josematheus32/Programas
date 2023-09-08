import java.util.Scanner;

public class Programa15 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Sistema de Multa|\n");
        System.out.print("\nDigite o Valor da Primeira Conta: ");
        double conta1 = ent.nextDouble();
        System.out.print("\nDigite o Valor da Segunda Conta: ");
        double conta2 = ent.nextDouble();
        System.out.print("\nDigite o Valor do Seu Salário: ");
        double salario = ent.nextDouble();

        double multa = (conta1+conta2)+((conta1+conta2)*2/100);

        double resto = (salario-multa);

        System.out.print("\nO Que Restou do Seu Salário: "+ resto);

        System.exit(0);


    }
}
