package testeJava;

import java.util.Scanner;

//Fazer um programa que  recebe um valor inteiro de 1 a 12 e mostre qual mês do ano é.

public class excond13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mes;
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
		default:
			mes = "Opção Inválida!";
			break;
		}
		
		System.out.println(mes);
		
		
		sc.close();
	}

}