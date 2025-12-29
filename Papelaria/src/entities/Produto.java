package entities;

import entities.interfaces.Manipulacao;

public abstract class Produto implements Manipulacao {
	
	private String marca;
	private float valor;
	
	public Produto(String marca, float valor) {
		this.marca = marca;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
