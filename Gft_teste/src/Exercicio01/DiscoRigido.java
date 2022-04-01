package Exercicio01;

public class DiscoRigido extends Hardware {
	protected int capacidade;
	protected int velocidade;
	protected int tipo;
	
	@Override
	public void getDetalhesHardware () {
		super.getDetalhesHardware();
		System.out.println("frequencia: " +this.getVelocidade());
		System.out.println("capacidade: %s" + this.getCapacidade());	
	}
	
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
