package br.com.ava.aula_4_exercicio_1;

public class Caminhao extends Veiculo {
	
	private int qtdRodas;

	public Caminhao(String placa, String cor, String modelo, int ano, int qtdRodas) {
		super(placa, cor, modelo, ano);
		this.qtdRodas = qtdRodas;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quantidade de Rodas : " + this.qtdRodas);
	}

}
