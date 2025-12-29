

import java.util.ArrayList;


public class Pedidos {
    private int clienteId;
    private ArrayList<Itempedido> itens;

    public Pedidos(int clienteId) {
        this.clienteId = clienteId;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Itempedido item) {
        itens.add(item);
    }

    public int getClienteId() {
        return clienteId;
    }

    public void exibirResumo() {
        System.out.println("Pedido do Cliente ID: " + clienteId);
        double total = 0;
        for (Itempedido item : itens) {
            item.exibirItem();
            total += item.getSubtotal();
        }
        System.out.println("Total do pedido: R$" + total);
    }
}
