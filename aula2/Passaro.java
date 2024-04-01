package aula2;

public class Passaro extends Animal{

    public String corDaPena;

    public Passaro(String nome, String especie, String corDaPena) {
        super(nome, especie);
        this.corDaPena = corDaPena;
    }

    public void emiteSom() {

        System.out.println("O pássaro está cantando: Gruuu gruuu ..");

    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "corDaPena='" + corDaPena + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
