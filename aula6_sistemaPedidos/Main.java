package aula6_sistemaPedidos;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String caminhoArquivo = "C:\\projetos\\aulas\\aula6_sistemaPedidos\\produtos.txt";
        List<Produto> produtos = ProdutoFileReader.lerArquivo(caminhoArquivo);

        Pedido pedido = new Pedido(1, "Em processamento", 1001);

        Produto produtoSelecionado1 = JOptionPaneUtils.selecionaPrduto("Escolha um item", produtos);
        int quantidadeProduto1 = JOptionPaneUtils.lerInteiro("Digite a quantidade de " + produtoSelecionado1.getNome() + ":");

        Produto produtoSelecionado2 = JOptionPaneUtils.selecionaPrduto("Escolha um item", produtos);
        int quantidadeProduto2 = JOptionPaneUtils.lerInteiro("Digite a quantidade de " + produtoSelecionado2.getNome() + ":");

        Item item1 = new Item(1, 1, 1, quantidadeProduto1, produtoSelecionado1.getPreco());
        Item item2 = new Item(2, 1, 2, quantidadeProduto2, produtoSelecionado2.getPreco());

        double subtotalItem1 = item1.calcularSubtotal();
        double subtotalItem2 = item2.calcularSubtotal();

        Item[] itensPedido = {item1, item2};
        double totalPedido = pedido.calcularTotal(itensPedido);

        String mensagem = getMensagemFinal(produtoSelecionado1, produtoSelecionado2, pedido, totalPedido, subtotalItem1, subtotalItem2);

        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static String getMensagemFinal(Produto produto1, Produto produto2, Pedido pedido, double totalPedido, double subtotalItem1, double subtotalItem2) {
        String mensagem = "Produtos:\n";
        mensagem += "1. " + produto1.getNome() + " - Preço unitário: " + produto1.getPreco() + "\n";
        mensagem += "2. " + produto2.getNome() + " - Preço unitário: " + produto2.getPreco() + "\n\n";
        mensagem += "Pedido:\n";
        mensagem += "ID do Pedido: " + pedido.getIdPedido() + "\n";
        mensagem += "Status do Pedido: " + pedido.getStatus() + "\n";
        mensagem += "Total do Pedido: " + totalPedido + "\n";
        mensagem += "Subtotal do Item 1: " + subtotalItem1 + "\n";
        mensagem += "Subtotal do Item 2: " + subtotalItem2 + "\n";
        return mensagem;
    }
}

