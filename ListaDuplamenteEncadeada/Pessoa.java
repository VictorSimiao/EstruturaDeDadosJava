package com.ListaDuplamenteEncadeada;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private String cpf;

	Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String toString() {
		return String.format("Nome: %s Idade: %d CPF: %s\n", this.nome, this.idade, this.cpf);
	}

	public boolean equals(Pessoa p) {
		if (this.cpf.equalsIgnoreCase(p.cpf))
			return true;

		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	/**retornando -1 (ou algum outro número negativo) significa que a antecede b*/
	/**se retorna +1 (ou algum outro número positivo) então a sucede b*/
	public int compareTo(Pessoa pessoa) {
		
		return this.getNome().compareTo(pessoa.getNome());
	}
}
