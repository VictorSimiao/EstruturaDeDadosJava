package com.ListaSimples;

public class ListaLigada {
	private String nomeLista;
	private Celula primeira;
	private Celula ultima;
	private int totalElementos;

	public ListaLigada(String nome) {
		this.nomeLista = nome;
		this.primeira = this.ultima = null;
		this.totalElementos = 0;
	}

	public void adicionarComerco(Aluno elemento) {

		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;

		if (totalElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalElementos++;
		imprimirLista();
	}

	public void adicionarFinal(Aluno elemento) {
		if (totalElementos == 0) {
			adicionarComerco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			totalElementos++;

		}
		imprimirLista();
	}

	/** Pega somente a posição ocupada dentro da lista */
	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalElementos;
	}

	/** Vai retornar uma celula em uma determinada posição */
	public Celula pegaCelula(int pos) {

		if (!posicaoOcupada(pos)) {
			System.out.println("Posição não existe na lista");
			return null;
		}
		Celula atual = this.primeira;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	public void adicionarPosicao(Aluno elemento, int pos) {
		if (pos == 0) {
			adicionarComerco(elemento);
		} else if (pos == totalElementos) {
			adicionarFinal(elemento);
		} else {
			/** pega a celula anterior a qual deseja inserir */
			Celula anterior = pegaCelula(pos - 1);
			/**
			 * Cria uma nova celula e faz o proximo dele ser o mesmo que o anterior get
			 * proximo
			 */
			Celula nova = new Celula(elemento, anterior.getProxima());
			/** Fazer a anterior apontar para nova */
			anterior.setProxima(nova);
			totalElementos++;
		}
		imprimirLista();
	}

	public boolean removeInico() {
		if (this.totalElementos == 0) {
			return false;
		}

		this.primeira = primeira.getProxima();
		totalElementos--;
		if (totalElementos == 0) {
			this.ultima = null;
		}
		imprimirLista();
		return true;
	}

	public boolean removeFinal() {
		if (totalElementos == 0) {
			return false;
		} else if (totalElementos == 1) {
			removeInico();
			return true;
		}

		Celula atualCelula = this.primeira;
		Celula anteriorCelula = null;
		while (atualCelula.getProxima() != null) {
			anteriorCelula = atualCelula;
			atualCelula = atualCelula.getProxima();
		}
		anteriorCelula.setProxima(atualCelula.getProxima());
		this.ultima = anteriorCelula;
		totalElementos--;
		imprimirLista();
		return true;
	}

	public boolean removePorNome(String nome) {
		if (totalElementos == 0)
			return true;
		Celula atuaCelula = this.primeira;
		Celula anteriorCelula = null;
		while (atuaCelula.getProxima() != null && atuaCelula.getElemento().getNome() != nome) {
			anteriorCelula = atuaCelula;
			atuaCelula = atuaCelula.getProxima();
		}
		anteriorCelula = atuaCelula.getProxima();
		totalElementos--;
		imprimirLista();
		return true;
	}

	public void imprimirLista() {
		System.out.println("_____________________________");
		System.out.println("Informações sobre a Lista: ");
		if (totalElementos == 0) {
			System.out.println("Lista está vazia");
		} else {
			Celula atualCelula = this.primeira;
			for (int i = 0; i < totalElementos; i++) {
				System.out.println(atualCelula.getElemento().getNome());
				atualCelula = atualCelula.getProxima();
			}
		}
		System.out.println("_____________________________");
	}

	// Inicio get e set //
	public String getNomeLista() {
		return nomeLista;
	}

	public void setNomeLista(String nomeLista) {
		this.nomeLista = nomeLista;
	}

	public Celula getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Celula primeira) {
		this.primeira = primeira;
	}

	public Celula getUltima() {
		return ultima;
	}

	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}

	public int getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(int totalElementos) {
		this.totalElementos = totalElementos;
	}
	// Fim get e set //

}
