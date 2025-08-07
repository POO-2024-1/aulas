package aula6_controle_excecoes;

public class SistemaPedidos {
    public static void main(String[] args) {
        ClientePF cliente1 = new ClientePF("Carlos Mendes", "carlos.m@email.com", "555.666.777-88");
        Pedido pedido1 = new Pedido(cliente1);

        ProdutoFisico monitor = new ProdutoFisico("Monitor 27'", 1500.00, 50.00);
        monitor.adicionarEstoque(5);

        try {
            System.out.println("Tentando adicionar 3 monitores...");
            pedido1.adicionarItem(new ItemPedido(monitor, 3));
            System.out.println("Adição bem-sucedida! Estoque atual: " + monitor.getEstoque());

            System.out.println("\nTentando adicionar mais 3 monitores...");
            pedido1.adicionarItem(new ItemPedido(monitor, 3));
            System.out.println("Adição bem-sucedida!");

        } catch (EstoqueInsuficienteException e) {
            System.err.println("\nERRO AO PROCESSAR PEDIDO: " + e.getMessage());
        }

        System.out.println("\n--- Recibo Final ---");
        System.out.println(pedido1.gerarRecibo());
    }
}