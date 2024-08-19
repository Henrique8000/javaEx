package estrutura_condicional;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class excond4 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int h_inicial, h_final;
		
		h_inicial = sc.nextInt();
		h_final = sc.nextInt();
		
		int duracao; 
		
		if ( h_inicial < h_final) {
			duracao = h_final - h_inicial;
		}
		else {
			duracao = (24 - h_inicial) + h_final;
		}
		System.out.println("O JOGO DUROU " + duracao);
		sc.close();

	}

}
