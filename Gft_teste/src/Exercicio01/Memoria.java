package Exercicio01;

public class Memoria extends Hardware{
	protected int frequencia;
	protected int capacidade;
	

	@Override
	public void getDetalhesHardware() {
		super.getDetalhesHardware();
		System.out.println("frequencia:"+ this.getFrequencia());
		System.out.println("capacidade:"+ this.getCapacidade());
		
	}



	public int getFrequencia() {
		return frequencia;
	}



	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}



	public int getCapacidade() {
		return capacidade;
	}



	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
