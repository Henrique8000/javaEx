

public class Produto {
    private static int contadorId = 1;

    private int id;
    private String fabricante;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(String fabricante, String descricao, double preco, int estoque) {
        this.id = contadorId++;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.precoUnitario = preco;
        this.quantidadeEstoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void retirarDoEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id + " | " + descricao + " | R$" + precoUnitario + " | Estoque: " + quantidadeEstoque);
    }
}

		

