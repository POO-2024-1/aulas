package aula5;

public class App {

    public static void main(String[] args) {

            Departamento departamento = new Departamento("Departamento de Informática",4);

            Curso bia = new Curso("Bacharelado em IA", "BIA",departamento,4);
            Curso bcc = new Curso("Ciencias da Computacao", "BCC",departamento,4);
            Curso eng = new Curso("Engenharia de Software", "ENG",departamento,4);

            Aluno vinicius = new Aluno("Vinicius Aguiar","2024123",bia);
            Aluno leonardo = new Aluno("Leonardo Afonso","20235689",bia);
            Aluno savio = new Aluno("Savio Salvarino","2019584",bcc);

            // Adicionando cursos ao departamento
            departamento.adicionarCurso(eng);
            departamento.adicionarCurso(bcc);
            departamento.adicionarCurso(bia);

            // Adicionando alunos aos cursos
            bia.adicionarAluno(vinicius);
            bia.adicionarAluno(leonardo);
            bia.adicionarAluno(savio);

            System.out.println("\n\n");
            System.out.println("Veja como foram preenchidos os atributos de Departamento\n\n");
            departamento.imprimirNomesDosCursos();

            System.out.println("\n\n");
            System.out.println("Veja como foram preenchidos os atributos de um Curso\n\n");
            bia.imprimirAlunos();

            System.out.println("\n\n");
            System.out.println("Veja como foram preenchidos os atributos de Aluno\n\n");
            System.out.println(vinicius);


    }
}
