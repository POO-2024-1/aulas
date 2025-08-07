package aula5_polimorfismo;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}