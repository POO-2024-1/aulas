package aula5_polimorfismo;

public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double getPreco();

    public abstract int getEstoque();

    public abstract void adicionarEstoque(int quantidade);

    public abstract void baixarEstoque(int quantidade);
}