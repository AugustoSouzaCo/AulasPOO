package model;

public class Usado extends Imovel{
	private double depreciacao;

	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	@Override
	public double getValor() {
		return (super.getValor() - depreciacao);
	}
}
