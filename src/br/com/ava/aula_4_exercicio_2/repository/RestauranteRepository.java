package br.com.ava.aula_4_exercicio_2.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.ava.aula_4_exercicio_2.entity.Prato;
import br.com.ava.aula_4_exercicio_2.entity.Restaurante;

public class RestauranteRepository {

	private List<Restaurante> restauranteBanco;

	public RestauranteRepository() {
		this.restauranteBanco = new ArrayList<>();
	}

	public void adicionarRestaurante(Restaurante restaurante) {
		this.restauranteBanco.add(restaurante);
	}

	public void removerRestaurante(Restaurante restaurante) {
	    Iterator<Restaurante> iterator = restauranteBanco.iterator();
	    while (iterator.hasNext()) {
	        Restaurante novo = iterator.next();
	        if (novo.getIdentificador().equals(restaurante.getIdentificador()) &&
	            novo.getNome().equals(restaurante.getNome())) {
	            iterator.remove();
	            break;
	        }
	    }
	}

	public Restaurante buscarRestaurante(Integer identificador, String nome) {
		for (Restaurante restaurante : restauranteBanco) {
			if (restaurante.getIdentificador().equals(identificador)
					|| restaurante.getNome().equals(nome)) {
				return restaurante;
			}
		}
		return null;
	}

	public List<Restaurante> listarRestaurantes() {
		return new ArrayList<>(restauranteBanco);
	}
	
	public List<Prato> listarPratosRestaurante(Integer identificador, String nome){
		Restaurante restaurante = buscarRestaurante(identificador, nome);
		if(restaurante != null) {
			return restaurante.getPratos();
		}
		return null;
	}	
}
