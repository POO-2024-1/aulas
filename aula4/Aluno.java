package aula4;

import aula3.Curso;

public class Aluno extends Pessoa{

    private String matricula;

    private int anoIngresso;

    public Aluno() { /* Contrtutor vazio */ }

    public Aluno(String nome, int idade, String matricula, int anoIngresso) {
        super(nome, idade);
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

    @Override
    public void  exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("matricula = " + matricula + ", Ano Ingresso = " + anoIngresso);
    }
}
