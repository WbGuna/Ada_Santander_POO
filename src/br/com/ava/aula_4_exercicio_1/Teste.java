package br.com.ava.aula_4_exercicio_1;

import java.util.Scanner;

public class Teste {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao sistema de cadastro de veículos!");
		System.out.println("Escolha o tipo de veículo que deseja cadastrar:");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("3 - Caminhão");
		int opcao = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite a placa: ");
		String placa = sc.nextLine();

		System.out.print("Digite a cor: ");
		String cor = sc.nextLine();

		System.out.print("Digite o modelo: ");
		String modelo = sc.nextLine();

		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();

		Veiculo veiculo;

		switch (opcao) {
		case 1:
			System.out.print("Digite a quantidade de portas: ");
			int qtdPortas = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite o tipo de combustível: ");
			String tipoCombustivel = sc.nextLine();

			veiculo = new Carro(placa, cor, modelo, ano, qtdPortas, tipoCombustivel);
			break;
		case 2:
			System.out.print("Digite as cilindradas: ");
			int cilindradas = sc.nextInt();

			veiculo = new Moto(placa, cor, modelo, ano, cilindradas);
			break;
		case 3:
			System.out.print("Digite a quantidade de rodas: ");
			int qtdRodas = sc.nextInt();

			veiculo = new Caminhao(placa, cor, modelo, ano, qtdRodas);
			break;
		default:
			System.out.println("Opção inválida!");
			return;
		}

		System.out.println("\nVeículo cadastrado com sucesso!\n");
		aplicarMulta(veiculo);
		sc.close();
		
		System.out.println("==========================================================");

	}
	
	public static void aplicarMulta(Veiculo veiculo) {
		System.out.println("Aplicando Multa: ");
		veiculo.exibirDados();
	}
	
	public static void imprimirDados(Veiculo veiculo) {
		veiculo.exibirDados();
	}

}
