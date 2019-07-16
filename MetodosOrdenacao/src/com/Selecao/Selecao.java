package com.Selecao;

public class Selecao {

	public static void main(String[] args) {
		int vetor[] = { 4, 7, 0, 9, 1 };

		selecao(vetor);

	}

	public static void selecao(int[] vetor) {
		int i, j, min;

		for (i = 0; i < vetor.length - 1; i++) {
			min = i;
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min])/** Valor decrescente é so alterar o sinal */
					min = j;

			}

			if (min == i) {
				System.out.println("Não é necessário a troca valores iguais");
			} else {
				troca(vetor, min, i);
				imprimirVetor(vetor);
			}
		}
	}

	public static void troca(int[] vetor, int i, int j) {
		int aux;
		aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

}
