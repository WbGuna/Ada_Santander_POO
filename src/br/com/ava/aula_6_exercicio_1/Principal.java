package br.com.ava.aula_6_exercicio_1;

import br.com.ava.aula_6_exercicio_1.contrato.Lista;
import br.com.ava.aula_6_exercicio_1.impl.ArrayLista;
import br.com.ava.aula_6_exercicio_1.impl.ListaLigada;
import br.com.ava.aula_6_exercicio_1.impl.StringArrayLista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new ArrayLista();

		lista.add("primeiro elemento");
		lista.add("segundo elemento");
		lista.add(1);
		lista.add(2);
		lista.remove(0);
		imprimirLista(lista);
		System.out.println();

		Lista lista2 = new StringArrayLista();
		lista2.add("meu nome");
		lista2.add("outro nome");
		lista2.remove(0);
		imprimirLista(lista2);
		System.out.println();

		Lista lista3 = new ListaLigada();
		lista3.add("primeiro elemento");
		lista3.add("segundo elemento");
		lista3.add(1);
		lista3.add(2);
		lista3.remove(1);
		imprimirLista(lista3);
		System.out.println();
	}

	public static void imprimirLista(Lista lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
