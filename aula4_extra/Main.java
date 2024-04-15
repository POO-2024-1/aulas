package aula4_extra;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Aluno("Savio Teles","032.425.785-05","20201256",2020);

        System.out.println("\n\n");
        System.out.println("Aluno criado\n\n");
        System.out.println("Nome : " + pessoa.getNome());
        System.out.println("Matricula : " + ((Aluno) pessoa).getMatricula());
        System.out.println("CPF : " + pessoa.getCpf());
        System.out.println("Ano Ingresso : " + ((Aluno) pessoa).getAnoIngresso());

        if (pessoa instanceof Aluno) {
            System.out.println("Eu sou um aluno....\n\n");
        }

        pessoa = new Professor(pessoa.getNome(), pessoa.getCpf(), "2024123","Professor Substituto");
        System.out.println("\n\n");
        System.out.println("Pessoa Savio após passar no concurso da UFG\n\n");
        System.out.println("Nome : " + pessoa.getNome());
        System.out.println("CPF : " + pessoa.getCpf());
        System.out.println("Registro Funcional : " + ((Professor) pessoa).getRegistroFuncional());
        System.out.println("Cargo : " + ((Professor) pessoa).getCargo());

        if (pessoa instanceof Aluno) {
            System.out.println("Eu sou um aluno....\n\n");
        } else {
            System.out.println("Eu passei em um concurso, agora eu sou um professor....\n\n");
        }
    }
}