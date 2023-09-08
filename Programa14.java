import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Programa14 {
    public static void main(String[] args) {

        DecimalFormat casa = new DecimalFormat("0");

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Opção 1 - Idade em Anos\nOpção 2 - Idade em Meses\nOpção 3 - Idade em Dias\nOpção 4 - Idade em Semanas\nOpção 5 - Sair\n\n", "Veja a sua idade", JOptionPane.PLAIN_MESSAGE));
            if (opcao > 5){

                JOptionPane.showMessageDialog(null, "Selecione a Opção de 1 a 5!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao > 5);

            if (opcao == 5) {

            JOptionPane.showMessageDialog(null, "Até Mais!!!", "Saindo", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }




        int past;

        past = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que você nasceu:", "Ano de Nascimento", JOptionPane.PLAIN_MESSAGE));

        int present;

        present = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano atual:", "Ano Atual", JOptionPane.PLAIN_MESSAGE));

        int idadeano = (present - past);
        int idademeses = (12)*(idadeano);
        int idadedias = (365)*(idadeano);
        int idadesemanas = (52)*(idadeano);

        if (opcao == 1){

            JOptionPane.showMessageDialog(null, "Sua Idade em Anos é: "+ casa.format(idadeano), "Idade em Anos", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        } else if (opcao == 2) {

            JOptionPane.showMessageDialog(null, "Sua Idade em Meses é: "+ casa.format(idademeses), "Idade em Meses", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        } else if (opcao == 3) {

            JOptionPane.showMessageDialog(null, "Sua Idade em Dias é: "+ casa.format(idadedias), "Idade em Dias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        } else if (opcao == 4) {

            JOptionPane.showMessageDialog(null, "Sua Idade em Semanas é: "+ casa.format(idadesemanas), "Idade em Semanas", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
    }
}
