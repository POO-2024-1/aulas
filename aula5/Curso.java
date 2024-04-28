package aula5;

import java.util.Arrays;

public class Curso {
    private String nome;

    private String sigla;
    private Departamento departamento;
    private Aluno[] alunos;
    private int numAlunos;

    public Curso(String nome, String sigla, Departamento departamento, int capacidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
        this.alunos = new Aluno[capacidade];
        this.numAlunos = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void adicionarAluno(Aluno aluno) {
        if (numAlunos < alunos.length) {
            alunos[numAlunos] = aluno;
            numAlunos++;
        } else {
            System.out.println("Capacidade máxima de alunos atingida para este curso.");
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public void imprimirAlunos() {
        System.out.println("Alunos do curso " + nome + ":");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("  - " + aluno.getNome());
            }
        }
    }
}
