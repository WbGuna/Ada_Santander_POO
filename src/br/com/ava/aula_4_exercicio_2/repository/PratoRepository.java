package br.com.ava.aula_4_exercicio_2.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import br.com.ava.aula_4_exercicio_2.entity.Prato;

public class PratoRepository {

	private List<Prato> pratoBanco;

	public PratoRepository() {
		this.pratoBanco = new ArrayList<>();
	}
	
	public void adicionarPrato(Prato prato) {
		this.pratoBanco.add(prato);
	}

	public void removerPrato(Prato prato) {
	    Iterator<Prato> iterator = pratoBanco.iterator();
	    while (iterator.hasNext()) {
	        Prato novo = iterator.next();
	        if (novo.getIdentificador().equals(prato.getIdentificador()) &&
	            novo.getNome().equals(prato.getNome())) {
	            iterator.remove();
	            break;
	        }
	    }
	}

	public Prato buscarPrato(Integer identificador, String nome) {
		for (Prato prato : pratoBanco) {
			if (prato.getIdentificador().equals(identificador)
					|| prato.getNome().equals(nome)) {
				return prato;
			}
		}
		return null;
	}

	public List<Prato> listarPratos() {
		return new ArrayList<>(pratoBanco);
	}	
}
