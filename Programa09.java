import java.util.Scanner;

public class Programa09{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Área do Trapézio|\n");
        System.out.print("\nDigite o Tamanho da Base Maior: ");
        double baseMaior = ent.nextDouble();

        double basemenor;

        do{
            System.out.print("\nDigite o Tamanho da Base Menor: ");
            basemenor = ent.nextDouble();

            if (basemenor > baseMaior){
                System.out.print("\nA Base Menor não pode ser Maior que a Base Maior!");
            }
        }while (basemenor > baseMaior);

        System.out.print("\nDigite a Altura: ");
        double altura = ent.nextDouble();

        double area = ((baseMaior + basemenor)* altura)/ 2;

        System.out.print("A Área do Trapézio é: "+ area);

        System.exit(0);


    }
}