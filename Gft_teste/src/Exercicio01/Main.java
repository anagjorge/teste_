package Exercicio01;

public class Main {

	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		cpu.setId(1);
		cpu.setDescricao("cpu");
		cpu.setValor(200);
		cpu.setFabricante("Samnsug");
		cpu.setClock("2");
		cpu.setModelo("am");
		cpu.getDetalhesHardware();
		
		
		Memoria memoria = new Memoria();
		memoria.setId(2);
		memoria.setDescricao("memoria");
		memoria.setValor(200);
		memoria.setFabricante("Philco");
		memoria.setFrequencia(200);
		memoria.setCapacidade(100);
	    memoria.getDetalhesHardware();
		
		
		DiscoRigido disco = new DiscoRigido();	
		disco.setId(3);
		disco.setDescricao("disco");
		disco.setValor(300);
		disco.setFabricante("AMD");
		disco.setVelocidade(500);
		disco.setCapacidade(300);
		disco.setTipo(5);
		disco.getDetalhesHardware();
		

	}

}
