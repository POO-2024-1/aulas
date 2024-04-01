package extra.heranca;

public class Temporario extends ServidorPublico {

    private double salario;

    private String contrato;

    public Temporario(int matricula, String nome, String cargo, double salario, String contrato) {
        super(matricula, nome, cargo);
        this.salario = salario;
        this.contrato = contrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Temporario{" +
                "salario=" + salario +
                ", contrato='" + contrato + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
