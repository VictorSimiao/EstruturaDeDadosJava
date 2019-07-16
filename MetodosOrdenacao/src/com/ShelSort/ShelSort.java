package com.ShelSort;

public class ShelSort {

	public static void main(String[] args) {
		
		int[] vetor = { 6, 2, 1, 3, 4, 5, 8, 7, 0 };
		shellSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" | ");
		}

	}

	public static void shell(int[] vetor, int dist) {
		int i, j, aux;
		for (i = dist; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - dist;
			while ((j >= 0) && (vetor[j] > aux)) {
				vetor[j + dist] = vetor[j];
				j = j - dist;

			}
			vetor[j+dist] = aux;
		}
	}
	
	public static void shellSort(int [] vetor) {
		int[] dist = {5,3,2,1};
		for (int i = 0; i < dist.length; i++) {
			shell(vetor, dist[i]);
		}
	}
	

}
