package aula5_polimorfismo;

public class SistemaPedidos {
    public static void main(String[] args) {
        ClientePJ cliente1 = new ClientePJ("Tech Solutions Ltda", "contato@tech.com", "12.345.678/0001-99");
        Pedido pedido1 = new Pedido(cliente1);

        Produto pFisico = new ProdutoFisico("Livro de Java", 89.90, 10.0);
        Produto pDigital = new ProdutoDigital("Licença de Software", 250.00);

        pedido1.adicionarItem(new ItemPedido(pFisico, 1));
        pedido1.adicionarItem(new ItemPedido(pDigital, 1));

        System.out.println(pedido1.gerarRecibo());
    }
}