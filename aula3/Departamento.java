package aula3;

public class Departamento {

    private String nome;

    private String sigla;

    private static final String UNIVERSIDADE = "UFG";

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getUniversidade(){
        return UNIVERSIDADE;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", universidade='" + UNIVERSIDADE + '\'' +
                '}';
    }
}
