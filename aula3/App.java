package aula3;

public class App {

    public static void main(String[] args) {

            Departamento departamento = new Departamento("Departamento de Informática","Inf");

            Curso curso = new Curso("Bacharelado em IA", "BIA",4,departamento);

            Aluno aluno = new Aluno("Vinicius Aguiar","2024123",2024,curso);

            System.out.println("\n\n");
            System.out.println("Veja como foram preenchidos os atributos de Departamento\n\n");
            System.out.println(departamento);

            System.out.println("\n\n");
            System.out.println("Veja como foram preenchidos os atributos de Aluno\n\n");
            System.out.println(aluno);


    }
}
