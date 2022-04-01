package Exercicio01;

public class Hardware {
	protected int id;
	protected String descricao;
	protected double valor;
	protected String fabricante;

	public void getDetalhesHardware() {
		System.out.println("Id:" + this.getId());
		System.out.println("Descricao:" + this.getDescricao());
		System.out.println("Valor: "+ this.getValor());
		System.out.println("Fabricante:"+ this.getFabricante());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}


