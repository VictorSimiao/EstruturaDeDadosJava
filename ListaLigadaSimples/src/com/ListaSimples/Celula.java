package com.ListaSimples;

public class Celula {

	private Aluno elemento; //Dados para essa celula
	private Celula proxima; //Referencia para a proxima celula da lista

	public Celula(Aluno elemento, Celula proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public Aluno getElemento() {
		return elemento;
	}

	public void setElemento(Aluno elemento) {
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	

	
}
