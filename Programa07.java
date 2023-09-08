import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa07{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0.0");

        System.out.print("\n|-------------------------|");
        System.out.print("\n|      Veja seu Peso      |");
        System.out.print("\n|                         |");
        System.out.print("\n| Opção 1 - Engordar 15%  |");
        System.out.print("\n| Opção 2 - Emagrecer 20% |");
        System.out.print("\n| Opção 3 - Sair          |");
        System.out.print("\n|-------------------------|");

        int opcao;

        do {
            System.out.print("\nDigite a Opção: ");
            opcao = ent.nextInt();

            if (opcao > 3) {
                System.out.print("\nSelecione a Opção de 1 a 3!");
            }
        }while (opcao > 3);

        if (opcao == 3){
            System.out.print("\nAté Mais!!!");
            System.exit(0);
        }

        System.out.print("\nDigite seu peso: ");
        double peso = ent.nextDouble();

        double opcao1 = (peso + (peso*15/100));
        double opcao2 = (peso - (peso*20/100));

        switch (opcao){

            case 1:
                System.out.print("\nSe Você Engordar 15% vai ficar: "+ deci.format(opcao1) +" kg");
                break;

            case 2:
                System.out.print("\nSe Você Emagrecer 20% vai ficar: "+ deci.format(opcao2) +" kg");
                break;
        }

        System.exit(0);

    }
}