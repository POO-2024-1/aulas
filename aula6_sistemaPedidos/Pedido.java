package aula6_sistemaPedidos;

public class Pedido {
    private int idPedido;
    private String status;
    private int idCliente;

    public Pedido(int idPedido, String status, int idCliente) {
        this.idPedido = idPedido;
        this.status = status;
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double calcularTotal(Item[] itens) {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public String atualizarStatus(int idPedido) {
        // Lógica para atualizar o status do pedido
        return "Status atualizado";
    }
}

