package br.com.ava.aula_1_exercicio_1;

import java.util.ArrayList;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(contatos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(contatos, other.contatos);
	}
}
