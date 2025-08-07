package aula3_composicao;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Pedido {
    private LocalDate data;
    private List<ItemPedido> itens;

    public Pedido() {
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
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
}
