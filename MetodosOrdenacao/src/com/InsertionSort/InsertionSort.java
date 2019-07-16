package com.InsertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		int vetor[] = { 9, 1, 8, 2, 15, 20 };
		insertSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

	public static int[] insertSort(int vetor[]) {
		int i, j, aux;

		for (i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			for (j = i - 1; j >= 0 && vetor[j] > aux; j--) {
				vetor[j + 1] = vetor[j];
				System.out.println("Copiando para direita.....");
			}
			if (vetor[j + 1] != aux) {
				vetor[j + 1] = aux;
				System.out.println("Realizando a Troca");
			}
		}

		return vetor;
	}
}
