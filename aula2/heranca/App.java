package aula2.heranca;

public class App {

    public static void main(String[] args) {

        ServidorPublico servidorPublico = new ServidorPublico(2023456,"Jose das Couves", "Coordenador");

        System.out.println("Veja como os atributos de Servidor Publicos foram preenchidos\n\nNome: " + servidorPublico.nome);
        System.out.println("Matricula: " + servidorPublico.matricula);
        System.out.println("Cargo: " + servidorPublico.cargo);


        Estatutario estatutario = new Estatutario(20241006,"Savio teles", "Professor", 2,55.555);
        System.out.println("\n\n");
        System.out.println("Veja como os atributos de Estatutario foram preenchidos\n\n");
        System.out.println(estatutario);

        Comissionado comissionado = new Comissionado(20241456, "Fernando Fonseca", "Assessor", 3.500,25.567);
        System.out.println("\n\n");
        System.out.println("Veja como os atributos de Comissionado foram preenchidos\n\n");
        System.out.println(comissionado);

        Temporario temporario = new Temporario(2022567,"Roberto Augusto","Servicos geras", 1.345,"Temp 1 ano");
        System.out.println("\n\n");
        System.out.println("Veja como os atributos de Temporario foram preenchidos\n\n");
        System.out.println(temporario);


    }
}
