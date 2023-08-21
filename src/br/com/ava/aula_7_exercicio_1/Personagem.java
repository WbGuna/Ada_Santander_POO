package br.com.ava.aula_7_exercicio_1;

public class Personagem {

	private String nome;
	private String tipo;

	public Personagem() {
	}

	public Personagem(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
