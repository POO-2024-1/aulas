public class Produto {
    String nome;
    double preco;
    int estoque;

    void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }
}