package aula2;

public class Gato extends Animal{

    public int quantidadePatas;

    public String cor;

    public Gato(String nome, String especie, int quantidadePatas, String cor) {
        super(nome, especie);
        this.quantidadePatas = quantidadePatas;
        this.cor = cor;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void emiteSom() {

        System.out.println("O gato está miando: Miau miau ...");

    }

    @Override
    public String toString() {
        return "Gato{" +
                "quantidadePatas=" + quantidadePatas +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
