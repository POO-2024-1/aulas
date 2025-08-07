package aula4_heranca;

public class SistemaPedidos {
    public static void main(String[] args) {
        ClientePF cliente1 = new ClientePF("Ana Sousa", "ana.s@email.com", "111.222.333-44");
        Pedido pedido1 = new Pedido(cliente1);

        Produto p1 = new Produto("Teclado Mecânico", 350.00);
        pedido1.adicionarItem(new ItemPedido(p1, 2));

        System.out.println("--- Pedido do Cliente: " + pedido1.getCliente().getNome() + " ---");
        System.out.printf("Valor total: R$ %.2f\n", pedido1.calcularTotal());
    }
}