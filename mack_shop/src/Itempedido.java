
public class Itempedido {
    private Produto produto;
    private int quantidade;

    public Itempedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return produto.getPrecoUnitario() * quantidade;
    }

    public void exibirItem() {
        System.out.println("- " + produto.getDescricao() + " x " + quantidade + " = R$" + getSubtotal());
    }
}
