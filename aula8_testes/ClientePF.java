package aula8_testes;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}