package aula2_encapsulamento;

public class SistemaPedidos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook Gamer", 5499.99);
        produto1.adicionarEstoque(15);
        produto1.exibirDetalhes();

        System.out.println("Consultando o preço do produto 1: R$ " + produto1.getPreco());
    }
}