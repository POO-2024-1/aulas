package aula4_extra;

public class Professor extends Pessoa {

    private String registroFuncional;

    private String cargo;

    public Professor(String nome, String cpf, String registroFuncional, String cargo) {
        super(nome, cpf);
        this.registroFuncional = registroFuncional;
        this.cargo = cargo;
    }

    public String getRegistroFuncional() {
        return registroFuncional;
    }

    public void setRegistroFuncional(String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
