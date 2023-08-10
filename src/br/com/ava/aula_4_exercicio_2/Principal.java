package br.com.ava.aula_4_exercicio_2;

import br.com.ava.aula_4_exercicio_2.controller.MenuController;
import br.com.ava.aula_4_exercicio_2.repository.ClienteRepository;
import br.com.ava.aula_4_exercicio_2.repository.PedidoRepository;
import br.com.ava.aula_4_exercicio_2.repository.RestauranteRepository;
import br.com.ava.aula_4_exercicio_2.service.ClienteService;
import br.com.ava.aula_4_exercicio_2.service.RestauranteService;

public class Principal {

	public static void main(String[] args) {
		RestauranteRepository restauranteRepository = new RestauranteRepository();
		ClienteRepository clienteRepository = new ClienteRepository();
		PedidoRepository pedidoRepository = new PedidoRepository();
		RestauranteService restauranteService = new RestauranteService(restauranteRepository, pedidoRepository);
		ClienteService clienteService = new ClienteService(clienteRepository, pedidoRepository, restauranteRepository, restauranteService);
		MenuController menu = new MenuController(restauranteService, clienteService, clienteRepository);
		menu.exibirMenu();

	}

}
