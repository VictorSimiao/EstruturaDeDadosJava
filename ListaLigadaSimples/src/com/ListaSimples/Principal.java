package com.ListaSimples;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entradaScanner = new Scanner(System.in);
		boolean menu = false;
		int opcao;
		ListaLigada listaLigada = new ListaLigada("Lista de Alunos");
		do {
			System.out.println("________________________________________");
			System.out.println("1-Adicionar no inicio");
			System.out.println("2-Adicionar na posição");
			System.out.println("3-Adicionar no final");
			System.out.println("4-Remove do Início");
			System.out.println("5-Remove por nome");
			System.out.println("6-Remover do final");
			System.out.println("7-Listar");
			System.out.println("0-Sair");
			System.out.println("________________________________________");
			opcao = entradaScanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do aluno: ");
				String nomeString = entradaScanner.next();
				Aluno aluno = new Aluno(nomeString);
				listaLigada.adicionarComerco(aluno);

				break;
			case 2:
				System.out.println("Informe o nome do aluno: ");
				String nome = entradaScanner.next();
				Aluno alunoposicao = new Aluno(nome);
				System.out.println("Informe a posição:");
				int pos = entradaScanner.nextInt();
				listaLigada.adicionarPosicao(alunoposicao, pos);

				break;
			case 3:
				System.out.println("Informe o nome do aluno: ");
				String nomeAlunoString = entradaScanner.next();
				Aluno alunoFinal = new Aluno(nomeAlunoString);
				listaLigada.adicionarFinal(alunoFinal);

				break;
			case 4:
				listaLigada.removeInico();

				break;
			case 5:
				System.out.println("Informe o nome do aluno:");
				String posRemove = entradaScanner.next();
				listaLigada.removePorNome(posRemove);

				break;
			case 6:
				listaLigada.removeFinal();

				break;
			case 7:
				listaLigada.imprimirLista();
				break;
			case 0:
				menu = true;
				break;
			default:
				System.out.println("Valor inválido");
				break;
			}

		} while (!menu);

		entradaScanner.close();
	}

}
