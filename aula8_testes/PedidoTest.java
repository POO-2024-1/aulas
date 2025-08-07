package aula8_testes;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class PedidoTest {
//
//    private Cliente cliente;
//    private Produto produtoFisico;
//    private Produto produtoDigital;
//
//    @BeforeEach
//    void setUp() {
//        cliente = new ClientePF("Cliente Teste", "teste@email.com", "123.456.789-00");
//        produtoFisico = new ProdutoFisico("Produto Físico Teste", 100.0, 20.0);
//        produtoDigital = new ProdutoDigital("Produto Digital Teste", 50.0);
//    }
//
//    @Test
//    void deveCalcularTotalCorretamente() {
//        Pedido pedido = new Pedido(cliente);
//        pedido.adicionarItem(new ItemPedido(produtoFisico, 2));
//        pedido.adicionarItem(new ItemPedido(produtoDigital, 1));
//
//        double precoFisico = (100.0 + 20.0) * 2;
//        double precoDigital = 50.0 * 1;
//        double totalEsperado = precoFisico + precoDigital;
//
//        assertEquals(totalEsperado, pedido.calcularTotal(), 0.001);
//    }
//
//    @Test
//    void deveLancarExcecaoParaEstoqueInsuficiente() {
//        ProdutoFisico produtoComEstoque = new ProdutoFisico("Produto com Estoque", 10.0, 1.0);
//        produtoComEstoque.adicionarEstoque(5);
//
//        Pedido pedido = new Pedido(cliente);
//
//        assertThrows(EstoqueInsuficienteException.class, () -> {
//            pedido.adicionarItem(new ItemPedido(produtoComEstoque, 6));
//        });
//    }
//
//    @Test
//    void naoDeveLancarExcecaoQuandoEstoqueForSuficiente() {
//        ProdutoFisico produtoComEstoque = new ProdutoFisico("Produto com Estoque", 10.0, 1.0);
//        produtoComEstoque.adicionarEstoque(5);
//
//        Pedido pedido = new Pedido(cliente);
//
//        assertDoesNotThrow(() -> {
//            pedido.adicionarItem(new ItemPedido(produtoComEstoque, 5));
//        });
//    }
//
//    @Test
//    void deveGerarReciboContendoNomeClienteEValorTotal() {
//        Pedido pedido = new Pedido(cliente);
//        pedido.adicionarItem(new ItemPedido(produtoFisico, 1));
//
//        String recibo = pedido.gerarRecibo();
//
//        assertTrue(recibo.contains("Cliente Teste"));
//        assertTrue(recibo.contains("TOTAL DO PEDIDO: R$ 120,00"));
//    }
//}