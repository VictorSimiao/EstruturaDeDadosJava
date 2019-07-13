package com.ListaDuplamenteEncadeada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		int pos;
		String nome, cpf;
		int idade;
		boolean menu = false;
		ListaDuplamente listaDuplamente = new ListaDuplamente();

		do {
			System.out.println("__________________Menu___________________");
			System.out.println("1-Adicionar no Começo ");
			System.out.println("2-Adicionar no final");
			System.out.println("3-Adicionar na posição");
			System.out.println("4-Excluir no começo");
			System.out.println("5-Excluir no final");
			System.out.println("6-Excluir na posição");
			System.out.println("7-Inserir Ordenado");
			System.out.println("0-Sair");
			System.out.println("_________________________________________");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe a idade: ");
				idade = input.nextInt();
				System.out.println("Informe o CPF: ");
				cpf = input.next();
				Pessoa pessoaComecoPessoa = new Pessoa(nome, idade, cpf);
				listaDuplamente.adicionarInicio(pessoaComecoPessoa);

				break;
			case 2:
				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe a idade: ");
				idade = input.nextInt();
				System.out.println("Informe o CPF: ");
				cpf = input.next();
				Pessoa pessoaFim = new Pessoa(nome, idade, cpf);
				listaDuplamente.adicionarFim(pessoaFim);

				break;
			case 3:
				System.out.println("Informe a Posição: ");
				pos = input.nextInt();
				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe a idade: ");
				idade = input.nextInt();
				System.out.println("Informe o CPF: ");
				cpf = input.next();
				Pessoa pessoapos = new Pessoa(nome, idade, cpf);
				listaDuplamente.adicionarPosicao(pos, pessoapos);

				break;
			case 4:
				listaDuplamente.removeComeco();
				break;
			case 5:
				listaDuplamente.removeFim();

				break;
			case 6:
				System.out.println("Informe a Posição: ");
				pos = input.nextInt();
				listaDuplamente.removePosicao(pos);

				break;
			case 7:
				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe a idade: ");
				idade = input.nextInt();
				System.out.println("Informe o CPF: ");
				cpf = input.next();
				Pessoa elementoPessoa = new Pessoa(nome, idade, cpf);
				listaDuplamente.addOrdenado(elementoPessoa);
				
				break;
			case 0:
				menu = true;

				break;

			default:
				System.out.println("Dados errados");
				break;
			}

		} while (!menu);
		input.close();

	}

}
