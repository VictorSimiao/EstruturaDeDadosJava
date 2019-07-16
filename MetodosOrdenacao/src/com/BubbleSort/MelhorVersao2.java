package com.BubbleSort;

public class MelhorVersao2 {

	public static void main(String[] args) {
    int [] vetor = {9,5,7,3,100,29,0,20,200};
		bolha(vetor);
    for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i]+ " | ");
		
	}
    
	}

	/** Ordenando de forma descrescente */
	public static void bolha(int[] vetor) {
		int i, aux, n, troca;
		n = 1;
		troca = 1;
		/** Laço com a quantidade de elementos de um vetor e enquanto houver troca */
		while (n < vetor.length - 1 && troca == 1) {
			troca = 0;
			/** Percorre da primeira ate a penultima posição */
			for (i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] < vetor[i + 1]) {
					troca = 1;
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
				}
			}
			n = n + 1;
		}

	}
}
