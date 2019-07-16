package com.InsertionSort;

public class Usandowhile {

	public static void main(String[] args) {
		int[] vetor = { 9, 1, 8, 2, 15, 20 };

		insercao(vetor);

	}

	public static void insercao(int[] vetor) {

		for (int proximo = 1; proximo < vetor.length; proximo++) {
			int carta = vetor[proximo]; // Carta a inserir
			int localInserir = proximo; // Local para inserir

			while (localInserir > 0 && vetor[localInserir - 1] > carta) {
				vetor[localInserir] = vetor[localInserir - 1];
				localInserir--;
			}

			vetor[localInserir] = carta;
			printVetor(vetor, proximo, localInserir);
		}
	}

	public static void printVetor(int[] vetor, int pass, int index) {

		System.out.printf("Depois de passar %2d: ", pass);

		// gera saída dos elementos até o item trocado
		for (int i = 0; i < index; i++)
			System.out.printf("%d ", vetor[i]);

		System.out.printf("%d* ", vetor[index]); // indica troca

		// termina de gerar a saída do array
		for (int i = index + 1; i < vetor.length; i++)
			System.out.printf("%d ", vetor[i]);

		System.out.printf("%n "); // para alinhamento

		// indica quantidade do array que é classificado
		for (int i = 0; i <= pass; i++)
			System.out.print("-- ");
		System.out.println();

	}

}
