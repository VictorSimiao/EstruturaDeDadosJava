package com.BinariaRecusiva;

public class BinariaRecusiva {
	static int qtdBusca;
	static int posicao;

	public static void main(String[] args) {

		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 26 };
		pesBinaria(vetor, 269, 0, vetor.length - 1);

		System.out.println("Quantidade de buscas realizadas: " + qtdBusca + " valor encontrado na posição: " + posicao);

	}

	public static boolean pesBinaria(int[] vetor, int valor, int esq, int dir) {
		int meio;
		if (esq <= dir) {
			meio = esq + ((dir - esq) / 2);
			qtdBusca++;
			if (valor > vetor[meio]) {
				return pesBinaria(vetor, valor, meio + 1, dir);
			} else {
				if (valor < vetor[meio]) {
					return pesBinaria(vetor, valor, esq, meio - 1);
				} else {
					posicao = meio;
					return true;
				}
			}
		}
		return false;
	}

}
