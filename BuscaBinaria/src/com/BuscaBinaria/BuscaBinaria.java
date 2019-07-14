package com.BuscaBinaria;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valores[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32 };
		int valor;
		int resultado;

		System.out.println("Informe o valor de busca: ");
		valor = entrada.nextInt();

		resultado = buscaBinaria(valores, valor);

		if (resultado == -1) {
			System.out.println("Valor não encontrado");
		} else {
			System.out.println("Encontrado no índice : " + resultado);
		}

		entrada.close();
	}

	public static int buscaBinaria(int vetor[], int valor) {
		int esq = 0;
		int dir = vetor.length - 1;
		int meio = 0;
		boolean encontrado = false;

		while (esq <= dir && !encontrado) {
			meio = esq + ((dir - esq) / 2);
			if (valor > vetor[meio]) {
				esq = meio + 1;
			} else {
				if (valor < vetor[meio]) {
					dir = meio - 1;
				} else {
					encontrado = true;
				}
			}
		}
		return (dir < esq) ? -1 : meio;
	}

}
