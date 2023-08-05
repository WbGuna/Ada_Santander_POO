package br.com.ava;

import br.com.ava.aula_1_exercicio_1.Agenda;
import br.com.ava.aula_1_exercicio_1.Contato;

public class MainAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contato contato1 = new Contato("João", "123456789");
		Contato contato2 = new Contato("Maria", "987654321");

		agenda.adicionar(contato1);
		agenda.adicionar(contato2);

		contato1.ligar();
		contato1.detalhar();
		
		agenda.deletar(contato2);
		Contato encontrado = agenda.buscar("Maria");

		if (encontrado != null) {
			encontrado.detalhar();
			encontrado.ligar();
		} else {
			System.out.println("Contato não encontrado");
		}
	}
}
