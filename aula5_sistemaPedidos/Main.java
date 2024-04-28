package aula5_sistemaPedidos;

import java.util.Date;

import javax.swing.JOptionPane;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Camiseta", "Camiseta branca", 29.99f, 50);
        Produto produto2 = new Produto(2, "Calça", "Calça jeans", 59.99f, 30);

        Pedido pedido = new Pedido(1, "Em processamento", 1001);

        int quantidadeProduto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Camisetas:"));
        int quantidadeProduto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Calças:"));

        Item item1 = new Item(1, 1, 1, quantidadeProduto1, produto1.getPreco());
        Item item2 = new Item(2, 1, 2, quantidadeProduto2, produto2.getPreco());

        double subtotalItem1 = item1.calcularSubtotal();
        double subtotalItem2 = item2.calcularSubtotal();

        Item[] itensPedido = {item1, item2};
        double totalPedido = pedido.calcularTotal(itensPedido);

        String mensagem = "Produtos:\n";
        mensagem += "1. " + produto1.getNome() + " - Preço unitário: " + produto1.getPreco() + "\n";
        mensagem += "2. " + produto2.getNome() + " - Preço unitário: " + produto2.getPreco() + "\n\n";
        mensagem += "Pedido:\n";
        mensagem += "ID do Pedido: " + pedido.getIdPedido() + "\n";
        mensagem += "Status do Pedido: " + pedido.getStatus() + "\n";
        mensagem += "Total do Pedido: " + totalPedido + "\n";
        mensagem += "Subtotal do Item 1: " + subtotalItem1 + "\n";
        mensagem += "Subtotal do Item 2: " + subtotalItem2 + "\n";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

