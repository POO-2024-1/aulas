package extra.polimorfismo;

public class App2Polimorfirsmo {

    public static void main(String[] args) {

         /* Código principal para
        * criação da servidora Isabela
        * Aqui é legal explicar o objetivo do CAsting, que neste caso é necessario explicar que o objeto criado
        * foi um servidor publico
        * do tipo comissionado, por isso, para ter acesso a comissao e salario fixo
        * e necessario efetuar o casting
        *  */
        ServidorPublico isabela = new Comissionado(2023456,"Isabella Silva", "Assessor",4.678,10.456);
        System.out.println("\n\n");
        System.out.println("Servidora comissionada criada\n\n");
        System.out.println("Nome : " + isabela.nome);
        System.out.println("Matricula : " + isabela.matricula);
        System.out.println("Cargo : " + isabela.cargo);
        System.out.println("Comissao : " + ((Comissionado)isabela).getComissao());
        System.out.println("Salario fixo : " + ((Comissionado)isabela).getSalarioFixo());

        /* Ai a isabella, que era comissionada, passou em um concurso, logo ela
         * sera contratada em regime de estutaria
         *  OBS.: legal mostrar que salarioFixo, Comissoa, não aparecem mais como opção
         * */
        isabela = new Estatutario(2023456,"Isabella Silva","Professor Adjunto",0,18.456);
        System.out.println("\n\n");
        System.out.println("Servidora Isabela apos passar em um concurso\n\n");
        System.out.println(isabela);

    }
}
