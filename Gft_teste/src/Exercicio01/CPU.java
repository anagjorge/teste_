package Exercicio01;

public class CPU extends Hardware {
	protected String clock;
	protected String modelo;
	
	
	@Override
	public void getDetalhesHardware() {
		super.getDetalhesHardware();
		System.out.println("frequencia:"+ this.getClock());
		System.out.println("capacidade:"+ this.getModelo());
		
	}
	
	public String getClock() {
		return clock;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
