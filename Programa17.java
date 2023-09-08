import java.util.Scanner;

public class Programa17 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|-----------------------------------|");
        System.out.print("\n|   Sistema de Calculos de Esfera   |");
        System.out.print("\n|                                   |");
        System.out.print("\n| Opção 1 - O Comprimento da Esfera |");
        System.out.print("\n| Opção 2 - A Área de uma Esfera    |");
        System.out.print("\n| Opção 3 - O Volume da Esfera      |");
        System.out.print("\n| Opção 4 - Sair                    |");
        System.out.print("\n|-----------------------------------|");

        int opcao;

        do {
            System.out.print("\nDigite a Opção: ");
            opcao = ent.nextInt();

            if (opcao > 4) {
                System.out.print("\nDigite a opção ente 1 e 4!");
            }
        } while (opcao > 4);

        if (opcao == 4){
            System.out.print("\nAté Mais!!!");
            System.exit(0);
        }

        System.out.print("\nDigite o valor do Raio: ");
        double raio = ent.nextDouble();

        System.out.print("\nDigite o valor de π: ");
        double pi = ent.nextDouble();

        double comprimento = (2 * pi * raio);
        double area = (pi * Math.pow(raio,2));
        double volume = (4/3 * pi * Math.pow(raio,3));


        switch (opcao){

            case 1:

                System.out.print("\nO Comprimento da Esfera é: "+ comprimento);
                break;

            case 2:

                System.out.print("\nA Área da Esfera é: "+ area);
                break;

            case 3:

                System.out.print("O Volume da Esfera é: "+ volume);
                break;

        }

        System.exit(0);



    }
}
