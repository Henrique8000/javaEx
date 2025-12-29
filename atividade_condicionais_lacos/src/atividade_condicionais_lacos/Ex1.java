package atividade_condicionais_lacos;

import java.util.Scanner;

/*
Enzo tem 6 anos e pediu ao seu irmão mais velho, que é um estudante do curso
de Ciência da Computação, para fazer um programa onde ele digita uma vogal
e aparece uma palavra que se inicia com aquela vogal.
 */

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma vogal: ");
		char vogal = sc.next().charAt(0);
		
		String palavra = switch (vogal) {
		case 'a' -> "Abóbora";
		case 'b' -> "Berinjela";
		case 'c' -> "Carro";
		case 'd' -> "Dado";
		case 'e' -> "Ervilha";
		case 'f' -> "Faca";
		case 'g' -> "gato";
		case 'h' -> "Heroi";
		case 'i' -> "Inteiro";
		case 'j' -> "Jogador";
		case 'k' -> "Kafka";
		case 'l' -> "Lagoa";
		case 'm' -> "Menino";
		case 'n' -> "Nenhum";
		case 'o' -> "Olhos";
		case 'p' -> "Pessoa";
		case 'q' -> "Querido";
		case 'r' -> "Resultado";
		case 's' -> "Serpente";
		case 't' -> "Tesouro";
		case 'u' -> "Uva";
		case 'v' -> "Velho";
		case 'w' -> "Willson";
		case 'x' -> "Xuxa";
		case 'y' -> "Ygor";
		case 'z' -> "Zion";
		default -> "Não é uma letra do alfabeto!";
		};
		
		System.out.println(palavra);
		
		sc.close();
	}

}
