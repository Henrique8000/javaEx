import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de 
//N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

public class exfor07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op;
		boolean menu = true; 
	
		while (menu) {
			
			System.out.print("Insira um número inteiro: ");
			int n = sc.nextInt();
			int total = 1;
			fact(n, total);
			
			System.out.print("\nDeseja Continuar?(S / N) ");
			op = sc.next().toUpperCase().trim().charAt(0);
			
			menu = tratamentoCondicao(op, menu);
			
		}	
		sc.close();
	}
	
	public static void fact(int a, int t) {
		if (a == 0) {
			System.out.println(1);
		}
		else {
			
			for (int i = a; i>0; i--) {	
				 t *= i;  
				System.out.println(t);
			}		
		}
		
	}
	
	public static boolean tratamentoCondicao(char op, boolean m) {
		Scanner sc = new Scanner(System.in);
		
		if (op == 'N') {
			System.out.println("Finalizando...");
			m = false;
		}
		
		else if (op == 'S') {
			m = true;
		}
		
		else {
			while(op != 'S' || op != 'N') {
				
				System.out.print("\nDigite uma opção válida!(S / N) ");
				op = sc.next().toUpperCase().trim().charAt(0);
				
				if (op == 'S') {
					break;
				}
				else if (op == 'N'){
					System.out.println("Finalizando...");
					m = false;
					break;
				}
				else {
					
				}
			}
		}
		
		return m;
	}	
}
