//Andreas Caycedo Martinez - 10435302"
//Eduardo Berthoux de Oliveira Souza - 10322329

/*import Eshop.Cliente;
import Eshop.Itempedido;
import Eshop.Pedidos;
import Eshop.Produto;
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class Eshop {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Pedidos> listaPedidos = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        // Produtos iniciais
        listaProdutos.add(new Produto("Nike", "Mochila", 299.90, 10));
        listaProdutos.add(new Produto("Puma", "Casaco", 599.00, 5));
        listaProdutos.add(new Produto("Adidas", "Tenis", 399.50, 8));

        while (!sair) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Cadastrar novo cliente");
            System.out.println("2. Cadastrar novo produto");
            System.out.println("3. Visualizar catálogo de produtos");
            System.out.println("4. Fazer um pedido");
            System.out.println("5. Visualizar ''meus pedidos''");
            System.out.println("6. Encerrar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("email: ");
                    String email = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    Cliente novoCliente = new Cliente(nome, email, endereco);
                    listaClientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso! Seu ID: " + novoCliente.getId());
                    break;

                case 2:
                    System.out.print("Fabricante: ");
                    String fabricante = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preço unitário: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto novoProduto = new Produto(fabricante, descricao, preco, quantidade);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Catálogo de Produtos ---");
                    for (Produto p : listaProdutos) {
                        p.exibirInformacoes();
                    }
                    break;

                case 4:
                    System.out.print("Informe seu ID de cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();

                    Cliente cliente = null;
                    for (Cliente c : listaClientes) {
                        if (c.getId() == idCliente) {
                            cliente = c;
                            break;
                        }
                    }

                    if (cliente == null) {
                        System.out.println("Cliente não encontrado. Cadastre-se primeiro.");
                        break;
                    }

                    Pedidos pedido = new Pedidos(cliente.getId());
                    boolean adicionando = true;

                    while (adicionando) {
                        System.out.println("\n--- Produtos disponíveis ---");
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            Produto p = listaProdutos.get(i);
                            System.out.println(i + " - ");
                            p.exibirInformacoes();
                        }

                        System.out.print("Escolha o número do produto (-1 para finalizar): ");
                        int escolha = scanner.nextInt();
                        if (escolha == -1) break;

                        if (escolha >= 0 && escolha < listaProdutos.size()) {
                            Produto produtoEscolhido = listaProdutos.get(escolha);
                            System.out.print("Quantidade desejada: ");
                            int qtd = scanner.nextInt();

                            if (qtd <= produtoEscolhido.getQuantidadeEstoque()) {
                                produtoEscolhido.retirarDoEstoque(qtd);
                                pedido.adicionarItem(new Itempedido(produtoEscolhido, qtd));
                                System.out.println("Produto adicionado ao pedido.");
                            } else {
                                System.out.println("Estoque insuficiente.");
                            }
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    listaPedidos.add(pedido);
                    System.out.println("\nResumo do pedido:");
                    pedido.exibirResumo();
                    break;

                case 5:
                    System.out.print("Informe seu ID de cliente: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontrou = false;
                    for (Pedidos p : listaPedidos) {
                        if (p.getClienteId() == idBusca) {
                            p.exibirResumo();
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Nenhum pedido encontrado para esse cliente.");
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    System.out.println("Andreas Caycedo Martinez - 10435302");
    				System.out.println("Eduardo Berthoux de Oliveira Souza - 10322329");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
