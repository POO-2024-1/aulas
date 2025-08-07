package aula6_controle_excecoes;

public class ProdutoFisico extends Produto {
    private double custoFrete;
    private int estoque;

    public ProdutoFisico(String nome, double precoBase, double custoFrete) {
        super(nome, precoBase);
        this.custoFrete = custoFrete;
        this.estoque = 0;
    }

    @Override
    public double getPreco() {
        return this.precoBase + this.custoFrete;
    }

    @Override
    public int getEstoque() {
        return this.estoque;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }

    @Override
    public void baixarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return;
        }
        if (this.estoque < quantidade) {
            throw new EstoqueInsuficienteException(
                    "Estoque insuficiente para o produto " + this.nome +
                            ". Disponível: " + this.estoque + ", Solicitado: " + quantidade);
        }
        this.estoque -= quantidade;
    }
}
