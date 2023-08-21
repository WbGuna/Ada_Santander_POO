package br.com.ava.aula_7_exercicio_1;

class Heroi extends Personagem {

	private String poder;

	public Heroi() {
		setTipo("Heroi");
	}

	public Heroi(String nome, String tipo, String poder) {
		super(nome, tipo);
		setTipo("Heroi");
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Heroi [poder=" + poder + ", getNome()=" + getNome() + ", getTipo()=" + getTipo() + super.toString()
				+ "]";
	}

}