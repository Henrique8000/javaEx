package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude; 
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public Double imposto() {
		Double impostoAtual = 0.0;
		
		if (getRendaAnual() < 20000.00) {
			impostoAtual = getRendaAnual() * 15 / 100;
		}
		
		else if(getRendaAnual() >= 20000.00) {
			impostoAtual = getRendaAnual() * 25 / 100;
		}
		
		if (gastosComSaude > 0.0) {
			 impostoAtual -=  gastosComSaude * 50 / 100;
		}
		
		return impostoAtual;
	}
}
