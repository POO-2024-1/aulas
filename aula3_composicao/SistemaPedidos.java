package aula3_composicao;

public class SistemaPedidos {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook Gamer", 5499.99);
        Produto p2 = new Produto("Mouse sem Fio", 120.50);

        Pedido pedido1 = new Pedido();

        pedido1.adicionarItem(new ItemPedido(p1, 1));
        pedido1.adicionarItem(new ItemPedido(p2, 2));

        System.out.println("Itens do Pedido:");
        for (ItemPedido item : pedido1.getItens()) {
            System.out.println(
                    "Produto: " + item.getProduto().getNome() +
                            " | Qtd: " + item.getQuantidade() +
                            " | Subtotal: R$ " + item.getSubtotal()
            );
        }

        System.out.printf("VALOR TOTAL DO PEDIDO: R$ %.2f\n", pedido1.calcularTotal());
    }
}