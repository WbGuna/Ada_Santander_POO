package br.com.ava.aula_1_exercicio_1;

import java.util.Objects;

public class Contato {

	private String nome;
	private String numero;

	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public void ligar() {
		System.out.println("Ligando para " + this.nome + " no número " + this.numero);
	}

	public void detalhar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Número: " + this.numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}	
}
