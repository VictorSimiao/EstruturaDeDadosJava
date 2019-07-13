package com.ListaDuplamenteEncadeada;

public class Celula {
	private Pessoa elemento;
	private Celula proximo;
	private Celula anterior;

	Celula(Pessoa elemento) {
		this.elemento = elemento;
		this.anterior = null;
		this.proximo = null;

	}

	Celula(Pessoa elemento, Celula proximo) {
		this.proximo = proximo;
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return this.proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Pessoa getElemento() {
		return elemento;
	}

	public void setElemento(Pessoa elemento) {
		this.elemento = elemento;
	}

	public String toString() {
		return this.elemento.toString();
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}
