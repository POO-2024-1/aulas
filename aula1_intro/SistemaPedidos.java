public class SistemaPedidos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.nome = "Notebook Gamer";
        produto1.preco = 5499.99;
        produto1.estoque = 15;

        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Preço do produto: R$ " + produto1.preco);
        System.out.println("Quantidade em Estoque do produto: " + produto1.estoque);

        produto1.exibirDetalhes();
    }
}