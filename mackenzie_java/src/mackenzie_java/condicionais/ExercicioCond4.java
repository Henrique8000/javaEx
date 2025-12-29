package mackenzie_java.condicionais;

/*
4.  Você está desenvolvendo um componente para a interface de um aplicativo de
	banco. Sua tarefa é criar uma mensagem de status simples baseada no saldo da conta
	do cliente. O programa deve solicitar o saldo e, em uma única linha de código,
	determinar se o status é "Positivo", "Negativo" ou "Zerado". Utilize o operador
	ternário.
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCond4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		String status = (saldo > 0) ? "Positivo" : (saldo < 0) ? "Negativo" : "Zerado";
		
		System.out.println(status);
		sc.close();		

	}

}
