package aula8_testes;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double getPreco() {
        return this.precoBase;
    }

    @Override
    public int getEstoque() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
    }

    @Override
    public void baixarEstoque(int quantidade) {
    }
}
