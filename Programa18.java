import java.util.Scanner;

public class Programa18{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("\n|Conversor de Celsius em Fahrenheit|\n");
        System.out.print("\nDigite a Temperatura em ºC: ");
        double c = ent.nextDouble();

        double f = (180*(c+32)/100);

        System.out.print("\nA Conversão ficou: "+ f +" ºF ");

        System.exit(0);
    }
}