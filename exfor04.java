import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

public class exfor04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int in = 0;
	int out = 0;
	
	for (int i = 0; i<n; i++) {
		if (i<10 || i>20) {
			out += 1;
		}
		else {
			in += 1;
		}
	}
	
	System.out.println(out + " out");
	System.out.println(in + " in");
	
	sc.close();
	
	
	}

}
