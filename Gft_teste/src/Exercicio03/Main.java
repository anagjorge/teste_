package Exercicio03;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setSexo("feminino");
		pessoa1.setDataNascimento("24/06/1998");
		
		pessoa1.setNome("Maria");
		pessoa1.imprimeTempoVidaRestante();
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setDataNascimento("13/12/1957");
		pessoa2.setSexo("masculino");
		pessoa2.setNome("João");
		pessoa2.imprimeTempoVidaRestante();
		
	}

}
