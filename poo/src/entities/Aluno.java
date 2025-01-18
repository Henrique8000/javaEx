package entities;

public class Aluno {
	
	public String nome;
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificaSePassou() {
		if (this.notaFinal() < 60.0) {
			return "FAILED \nMISSING " 
					+ String.format("%.2f", 60.0 - notaFinal())
					+ " POINTS";
		} 
		
		else {
			return "PASS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ notaFinal()
				+ "\n"
				+ verificaSePassou();
	}
}
