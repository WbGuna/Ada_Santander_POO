package br.com.ava.aula_1_exercicio_1;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> contatos;

	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}
	
	public void deletar(Contato contato) {
		this.contatos.remove(contato);
	}

	public Contato buscar(String nome) {
		for (Contato contato : this.contatos) {
			if (contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}

	public void adicionar(Contato contato) {
		this.contatos.add(contato);
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
}
