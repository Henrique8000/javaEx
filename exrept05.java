import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo

public class exrept05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		//variável booleana que serve para entrar e sair do loop while 
		
		boolean cont = true;
		
		//variáveis que servem para contar a quantidade de combustiveis selecionados (a = Alcool; g = Gasolina; d = Diesel)
		
		int a = 0;
		int g = 0;
		int d = 0;
		
		//loop while que exibe o menu com opçoes de combustiveis a serem selecionados e a opção de sair do loop (opção 4)
		while (cont) {
			System.out.println("\ninforme qual tipo de combustivel você mais usa: ");
			System.out.println("1.Álcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim\n");
			
			//variável que recebe um valor inteiro informado pelo usuário
			System.out.print(">>>");
			int opcao = sc.nextInt();
			
		  //estrutura condicional que determina qual condição será executada baseando-se na entrada do usuário na variavel 'opcao' 
			
			if (opcao == 1) {
				a += 1;
			} else if (opcao == 2) {
				g += 1;
			} else if (opcao == 3) {
				d += 1;
			} else if (opcao == 4) {
				System.out.println("MUITO OBRIGADO!");
				System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d", a, g, d);
				cont = false;
				
			//se por acaso uma opção que não encaixe no intervalo de 1 a 4 for digitada pelo usuário (ex: 5), a condicional else 
			//será executada e retornara ao loop imprimindo a seguinte mensagem "Insira uma opção válida, insira um número inteiro de 1 a 4"
				
			} else {
				System.out.println("Insira uma opção válida, insira um número inteiro de 1 a 4\n");
			}

		}

		sc.close();

	}

}
