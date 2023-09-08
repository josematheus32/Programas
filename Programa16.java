import java.util.Scanner;

public class Programa16 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Valor da Hipotenusa|\n");
        System.out.print("\nDigite A: ");
        double a = ent.nextDouble();
        System.out.print("\nDigite B: ");
        double b = ent.nextDouble();

        double hipotenusa = (Math.pow(a,2)+Math.pow(b,2));

        double hipo = Math.sqrt(hipotenusa);

        System.out.print("\nO Valor da Hipotenusa é: "+ hipo);

        System.exit(0);
    }
}
