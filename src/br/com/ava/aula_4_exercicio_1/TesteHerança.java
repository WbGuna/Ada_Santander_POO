package br.com.ava.aula_4_exercicio_1;

public class TesteHerança {

	public static void main(String[] args) {
		
		Carro carro = new Carro("1234", "Cinza", "Civic", 2023, 4, "Flex");
		
		Moto moto = new Moto("4567", "Preto", "CG", 2020, 250);
		
		carro.exibirDados();
		System.out.println("=============================");
		moto.exibirDados();

	}

}
