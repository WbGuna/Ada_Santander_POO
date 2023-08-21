package br.com.ava.aula_7_exercicio_1;

class Vilao extends Personagem {

    private String habilidade;

    public Vilao() {
        setTipo("Vilão");
    }

    public Vilao(String nome, String tipo, String habilidade) {
        super(nome, tipo);
        setTipo("Vilão");
        this.habilidade = habilidade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

	@Override
	public String toString() {
		return "Vilao [habilidade=" + habilidade + ", getNome()=" + getNome() + ", getTipo()=" + super.toString()
				+ "]";
	}
    
    
}
