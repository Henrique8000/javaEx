import java.util.Scanner;

//Leia 1 valor inteiro N(2 < N < 1000). A seguir, mostre a tabuada
//de N: 1xN = N    2xN = 2N  ...  10xN = 10N

public class exfor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int m = i * n;
			System.out.println(i+" x " + n + " = " + m);
		}
		
		sc.close();
		

	}

}
 