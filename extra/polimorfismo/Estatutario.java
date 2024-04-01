package extra.polimorfismo;

public class Estatutario extends ServidorPublico {

    private int tempoDeServico;

    private double salarioBase;

    public Estatutario(int matricula, String nome, String cargo, int tempoDeServico, double salarioBase) {
        super(matricula, nome, cargo);
        this.tempoDeServico = tempoDeServico;
        this.salarioBase = salarioBase;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Estatutario{" +
                "tempoDeServico=" + tempoDeServico +
                ", salarioBase=" + salarioBase +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
