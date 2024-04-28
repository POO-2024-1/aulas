package aula5;

import java.util.Arrays;

public class Departamento {
    private String nome;
    private Curso[] cursos;
    private int numCursos;

    public Departamento(String nome, int capacidade) {
        this.nome = nome;
        this.cursos = new Curso[capacidade];
        this.numCursos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCurso(Curso curso) {
        if (numCursos < cursos.length) {
            cursos[numCursos] = curso;
            numCursos++;
        } else {
            System.out.println("Capacidade máxima de cursos atingida para este departamento.");
        }
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void imprimirNomesDosCursos() {
        System.out.println("Cursos do " + nome + ":");
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("  - "  + curso.getNome());
                //curso.imprimirAlunos();
            }
        }
    }
}