

public class Cliente {
    private static int contadorId = 1;

    private int id;
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String nome, String email, String endereco) {
        this.id = contadorId++;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Endereço: " + endereco;
    }
}
