import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Área do Losango|\n");
        System.out.print("\nDigite o Tamanho da Diagonal Maior: ");
        double dmaior = ent.nextDouble();

        double dmenor;

         do{
             System.out.print("\nDigite o Tamanho da Diagonal Menor: ");
             dmenor = ent.nextDouble();

             if (dmenor > dmaior){
                 System.out.print("\n\nA Diagonal Menor não pode ser Maior que a Diagonal Maior!");
             }
         }while (dmenor > dmaior);

         double area = (dmaior*dmenor)/2;

        System.out.print("\nA Área do Losango é: "+ area);

        System.exit(0);
    }
}
