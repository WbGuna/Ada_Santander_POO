package br.com.ava.aula_4_exercicio_2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ava.aula_4_exercicio_2.entity.Pedido;
import br.com.ava.aula_4_exercicio_2.entity.Prato;
import br.com.ava.aula_4_exercicio_2.entity.Restaurante;
import br.com.ava.aula_4_exercicio_2.repository.PedidoRepository;
import br.com.ava.aula_4_exercicio_2.repository.RestauranteRepository;

public class RestauranteService {

	private RestauranteRepository restauranteRepository;
	private PedidoRepository pedidoRepository;
	private List<Pedido> pedidoBanco;

	public RestauranteService(RestauranteRepository restauranteRepository, PedidoRepository pedidoRepository) {
		this.restauranteRepository = restauranteRepository;
		this.pedidoRepository = pedidoRepository;
		this.pedidoBanco = new ArrayList<>();
	}

	public void cadastrarRestaurante(Restaurante restaurante) {
		restauranteRepository.adicionarRestaurante(restaurante);
	}

	public List<Restaurante> listarRestaurantes() {
		return restauranteRepository.listarRestaurantes();
	}

	public void adicionarPrato(Integer identificador, String nome, Prato prato) {
		Restaurante restaurante = restauranteRepository.buscarRestaurante(identificador, nome);
		if (restaurante != null) {
			restaurante.getPratos().add(prato);
		}
	}

	public List<Prato> listarPratosRestaurante(Integer identificador, String nome) {
		return restauranteRepository.listarPratosRestaurante(identificador, nome);
	}

	public List<Pedido> listarPedidosRestaurante(Integer identificador, String nome) {
		Restaurante restaurante = restauranteRepository.buscarRestaurante(identificador, nome);
		if (restaurante != null) {
			return pedidoBanco.stream().filter(pedido -> pedido.getRestaurante().equals(restaurante))
					.collect(Collectors.toList());
		}
		return null;

	}

	public void adicionarPedido(Pedido pedido) {
		pedidoBanco.add(pedido);
	}
}
