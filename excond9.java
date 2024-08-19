package testeJava;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler as duas notas que um aluno obteve no primeiro e 
//segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano 
//juntamente com o texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem 
//"REPROVADO", conforme exemplos. Todos os valores devem ter uma casa decimal.

public class excond9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, nota_final;
		
		n1 = sc.nextDouble();
		sc.nextLine();
		n2 = sc.nextDouble();
		
		nota_final = (n1 + n2) ;
		
		if (nota_final >= 60.0) {
			System.out.println("NOTA FINAL = " + nota_final);
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", nota_final);
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
