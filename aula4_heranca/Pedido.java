package aula4_heranca;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Pedido {
    private LocalDate data;
    private List<ItemPedido> itens;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : this.itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
}
