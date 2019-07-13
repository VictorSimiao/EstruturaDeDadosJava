package com.ListaDuplamenteEncadeada;

public class ListaDuplamente {
	private Celula primeira;
	private Celula ultima;
	private int totalElementos;

	ListaDuplamente() {
		this.primeira = this.ultima = null;
		this.totalElementos = 0;

	}

	public void adicionarInicio(Pessoa elemento) {
		if (totalElementos == 0) {
			Celula novaCelula = new Celula(elemento);
			this.primeira = novaCelula;
			this.ultima = novaCelula;
			totalElementos++;
		} else {
			Celula novaCelula = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(novaCelula);
			this.primeira = novaCelula;
			totalElementos++;
		}
		listar();
	}

	public void adicionarFim(Pessoa elemento) {
		if (totalElementos == 0) {
			this.adicionarInicio(elemento);
		} else {
			Celula novaCelula = new Celula(elemento);
			this.ultima.setProximo(novaCelula);
			novaCelula.setAnterior(this.ultima);
			this.ultima = novaCelula;
			totalElementos++;
			listar();
		}
	}

	public Celula pegaCelula(int pos) {
		Celula atualCelula = null;
		if (pos >= 0 && pos < this.totalElementos) {
			atualCelula = this.primeira;
			for (int i = 0; i < pos; i++) {
				atualCelula = atualCelula.getProximo();
			}
		}
		return atualCelula;
	}

	public void adicionarPosicao(int pos, Pessoa elemento) {
		if (pos == 0) {
			adicionarInicio(elemento);
		} else if (totalElementos == pos) {
			adicionarFim(elemento);
		} else {
			Celula anteriorCelula = pegaCelula(pos - 1);
			Celula proximaAnteriorCelula = anteriorCelula.getProximo();

			Celula novaCelula = new Celula(elemento, anteriorCelula.getProximo());
			novaCelula.setAnterior(anteriorCelula);
			anteriorCelula.setProximo(novaCelula);
			proximaAnteriorCelula.setAnterior(novaCelula);
			this.totalElementos++;
			listar();
		}
	}

	public void removeComeco() {
		if (totalElementos == 0) {
			System.out.println("Lista está vazia");
		} else {
			this.primeira = this.primeira.getProximo();
			totalElementos--;
			if (totalElementos == 0) {
				this.ultima = null;
			}
			listar();
		}

	}

	public void removeFim() {
		if (totalElementos == 0) {
			System.out.println("Lista está vazia");
		} else if (totalElementos == 1) {
			this.removeComeco();
		} else {
			Celula penultimaCelula = ultima.getAnterior();
			penultimaCelula.setProximo(null);
			this.ultima = penultimaCelula;
			listar();
		}

	}

	public void removePosicao(int pos) {
		if (totalElementos == 0) {
			System.out.println("Lista está vazia");
		} else if (pos == 0) {
			removeComeco();
		} else if (pos == totalElementos - 1) {
			removeFim();
		} else {
			if (pos >= 0 && pos < totalElementos) {
				Celula anteriorCelula = pegaCelula(pos - 1);
				Celula atualCelula = anteriorCelula.getProximo();
				Celula proximaCelula = atualCelula.getProximo();

				anteriorCelula.setProximo(proximaCelula);
				proximaCelula.setAnterior(anteriorCelula);
				totalElementos--;
				listar();
			} else {
				System.out.println("posição não existe");
			}
		}

	}

	public void listar() {
		if (this.primeira == null) {
			System.out.println("Lista está vazia");
		} else {
			Celula atualCelula = this.primeira;
			System.out.println("______Dados da Lista_________");
			while (atualCelula != null) {
				System.out.print(atualCelula.getElemento().toString());
				atualCelula = atualCelula.getProximo();
			}
		}
	}

	public void addOrdenado(Pessoa elementoPessoa) {

		if (this.totalElementos == 0) {
			adicionarInicio(elementoPessoa);
		} else if (this.primeira.getElemento().getNome().compareTo(elementoPessoa.getNome()) > 0) {
			// se retorna +1 (ou algum outro número positivo) então a sucede b
			adicionarInicio(elementoPessoa);
		} else if (this.ultima.getElemento().getNome().compareTo(elementoPessoa.getNome()) < 0) {
			// retornando -1 (ou algum outro número negativo) significa que a antecede b
			adicionarFim(elementoPessoa);
		} else {
			Celula novaCelula = new Celula(elementoPessoa);
			Celula atualCelula = this.primeira;
			// procura um elemento na lista maior ou igual que o elemento a ser inserido
			while (atualCelula.getElemento().getNome().compareTo(elementoPessoa.getNome()) < 0) {
				atualCelula = atualCelula.getProximo();
			}

			Celula anteriorCelula = atualCelula.getAnterior();

			anteriorCelula.setProximo(novaCelula);

			novaCelula.setAnterior(anteriorCelula);

			novaCelula.setProximo(atualCelula);

			atualCelula.setAnterior(novaCelula);

			totalElementos++;
			listar();

		}

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

}
