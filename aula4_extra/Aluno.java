package aula4_extra;

public class Aluno extends Pessoa {

    private String matricula;

    private int anoIngresso;

    public Aluno(String nome, String cpf, String matricula, int anoIngresso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
