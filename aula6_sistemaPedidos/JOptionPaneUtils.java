package aula6_sistemaPedidos;

import javax.swing.JOptionPane;
import java.util.List;

public class JOptionPaneUtils {

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String lerString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static int lerInteiro(String mensagem) {
        int opcao = 0;
        boolean opcaoValida = false;

        while (!opcaoValida) {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
                opcaoValida = true;
            } catch (NumberFormatException e) {
                exibirMensagem("Por favor, digite um número inteiro válido.");
            }
        }
        return opcao;
    }

    public static double lerDouble(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    }

    public static char lerChar(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return input.charAt(0);
    }

    public static Produto selecionaPrduto(String mensagem, List<Produto> produtos){
        return (Produto) JOptionPane.showInputDialog(null, mensagem, "Opção", JOptionPane.INFORMATION_MESSAGE, null, produtos.toArray(), produtos.get(0));
    }
}
