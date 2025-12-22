package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numFuncs;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAtual, Integer numFuncs) {
		super(nome, rendaAtual);
		this.numFuncs = numFuncs;
	}

	public Integer getNumFuncs() {
		return numFuncs;
	}

	public void setNumFuncs(Integer numFuncs) {
		this.numFuncs = numFuncs;
	}
	
	@Override
	public Double imposto() {
		
		if (numFuncs > 10) {
			return getRendaAnual() * 14 / 100;
		}
		else {
			return getRendaAnual() * 16 / 100;
		}
		
	}
	
}
