package aula2;

public class Cachorro extends Animal {

    public int quantidadePatas;

    public Cachorro(String nome, String especie, int quantidadePatas) {
        super(nome, especie);
        this.quantidadePatas = quantidadePatas;
    }

    public void emiteSom() {

        System.out.println("O cachorro está latindo: Au au au...");

    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "quantidadePatas=" + quantidadePatas +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
