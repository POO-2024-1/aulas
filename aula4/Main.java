package aula4;

public class Main {
    public static void main(String[] args) {

        /*
        * Criando uma instância da classe Pessoa
        */
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("Detalhes da Pessoa:");
        pessoa.exibirDetalhes();
        System.out.println();

        /*
        * Criando uma instância da classe Aluno
        */
        Aluno aluno = new Aluno("Maria", 25, "12345",2024);
        System.out.println("Detalhes do Aluno:");
        aluno.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Pessoa (utilizando instanceof e casting):");
        Pessoa pessoaAluno = new Aluno();
        pessoaAluno.setIdade(12);
        pessoaAluno.setNome("teste");
        System.out.println("Detalhes do pessoaAluno:");
        pessoaAluno.exibirDetalhes();

        if(pessoaAluno instanceof Aluno) {
            System.out.println();
            Aluno alunoCast = (Aluno) pessoaAluno;
            alunoCast.setMatricula("2323");
            alunoCast.setAnoIngresso(2024);
            System.out.println("Detalhes do alunoCast:");
            alunoCast.exibirDetalhes();
        }

    }
}
