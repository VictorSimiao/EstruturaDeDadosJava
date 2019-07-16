package com.QuickSort;

public class QuickSort {
	public static void main(String[] args) {

		int[] vetor = { 6, 2, 1, 3, 4, 5, 8, 7, 0 };
		quickSort(vetor, 0, vetor.length - 1);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}

	}

	public static void quickSort(int[] vetor, int inic, int fim) {
		int i = inic;
		int f = fim;
		int aux;
		int pivo = vetor[(inic + fim) / 2];
		do {
			while (pivo > vetor[i] && i < fim)
				i++;
			while (pivo < vetor[f] && f > inic)
				f--;
			if (i <= f) {
				aux = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = aux;
				i++;
				f--;
			}

		} while (i <= f);
		if (inic < f) {
			quickSort(vetor, inic, f);
		}
		if (i < fim) {
			quickSort(vetor, i, fim);
		}
	}

}
