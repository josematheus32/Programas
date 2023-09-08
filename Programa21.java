import java.util.Scanner;

public class Programa21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorSalarioMinimo;
        double horasTrabalhadas;
        double horasExtras;
        double salarioReceber;

        System.out.print("\n|-----------------------------|");
        System.out.print("\n|     Cálculo de Salário      |");
        System.out.print("\n|-----------------------------|");
        System.out.print("\n| Opção 1 - Calcular Salário  |");
        System.out.print("\n| Opção 2 - Sair              |");
        System.out.print("\n|-----------------------------|");

        int opcao;

        do {
            System.out.print("Digite a Opção: ");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 2) {
                System.out.print("\n\nSelecione uma Opção válida (1 ou 2)!");
            }
        } while (opcao < 1 || opcao > 2);

        if (opcao == 2) {
            System.out.print("\nAté Mais!!!");
            System.exit(0);
        }

        System.out.print("\nDigite o valor do salário mínimo: ");
        valorSalarioMinimo = input.nextDouble();

        System.out.print("\nDigite o número de horas trabalhadas: ");
        horasTrabalhadas = input.nextDouble();

        System.out.print("\nDigite o número de horas extras trabalhadas: ");
        horasExtras = input.nextDouble();

        switch (opcao) {
            case 1:
                double valorHoraTrabalhada = valorSalarioMinimo / 8;
                double valorHoraExtra = valorSalarioMinimo / 4;

                double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
                double valorHorasExtras = horasExtras * valorHoraExtra;

                salarioReceber = salarioBruto + valorHorasExtras;

                System.out.print("\nSalário a Receber: " + salarioReceber);
                break;
        }

        System.exit(0);
    }
}
