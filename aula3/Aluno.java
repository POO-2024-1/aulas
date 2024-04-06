package aula3;

public class Aluno {

    private String nome;

    private String matricula;

    private int anoIngresso;

    private Curso curso;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, int anoIngresso, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anoIngresso=" + anoIngresso +
                ", curso=" + curso +
                '}';
    }


}
