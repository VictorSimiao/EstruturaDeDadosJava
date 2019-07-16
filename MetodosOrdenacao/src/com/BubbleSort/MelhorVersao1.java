package com.BubbleSort;

public class MelhorVersao1 {

	public static void main(String[] args) {

		int[] vetor = { 0, 5, 3, 4, 2, 7 };
		
		bolha(vetor);
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+ " | ");
		}

	}

	public static void bolha(int[] vetor) {
		int i, j, aux;
		/**Laço com a quantidade de elementos -1 para elementos de 1 até 4 faça */
		for (i = 1; i <= vetor.length; i++) {
			/**Percorre da ultima posição a posição j do vetor */
			for (j = vetor.length-1; j >= i; j--) {

				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}

			}
		}
	}

}
