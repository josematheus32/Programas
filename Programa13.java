import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa13 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        DecimalFormat deci2 = new DecimalFormat("0");

        System.out.print("\n|-------------------------|");
        System.out.print("\n|   Sistema de Tabuada    |");
        System.out.print("\n|                         |");
        System.out.print("\n| Opção 1 - Adição        |");
        System.out.print("\n| Opção 2 - Subtração     |");
        System.out.print("\n| Opção 3 - Multiplicação |");
        System.out.print("\n| Opção 4 - Divisão       |");
        System.out.print("\n| Opção 5 - Sair          |");
        System.out.print("\n|-------------------------|");

        int opcao;

        do{
            System.out.print("\nDigite uma Opção: ");
            opcao = ent.nextInt();

            if (opcao > 5){
                System.out.print("\nSelecione a Opção de 1 a 5!");
            }
        }while (opcao > 5);

        if (opcao == 5){
            System.out.print("\nAté Mais!!!");
            System.exit(0);
        }

        System.out.print("\nDigite um Número para a Tabuada: ");
        int n1 = ent.nextInt();


        switch (opcao){

            case 1:

                System.out.print("\nTabuada (Adição)");
                for (int n2 = 0; n2 <= 10; n2++){
                    int adicao = (n1+n2);
                    System.out.print("\n"+ n1 +" + "+ n2 +" = "+ adicao);
                }
                break;

            case 2:

                System.out.print("\nTabuada (Subtração)");
                for (int n2 = 0; n2 <= 10; n2++){
                    int sub = (n1-n2);
                    System.out.print("\n"+ n1 +" - "+ n2 +" = "+ sub);
                }
                break;

            case 3:

                System.out.print("\nTabuada (Multiplicação)");
                for (int n2 = 0; n2 <= 10; n2++){
                    int multi = (n1*n2);
                    System.out.print("\n"+ n1 +" x "+ n2 +" = "+ multi);
                }
                break;

            case 4:

                System.out.print("\nTabuada (Divisão)");
                for (double n2 = 1; n2 <= 10; n2++){
                    double divi = (n1/n2);
                    System.out.print("\n"+ n1 +" / "+ deci2.format(n2) +" = "+ divi);
                }
                break;

        }


        System.exit(0);

    }
}
