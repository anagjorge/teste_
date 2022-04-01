package Exercicio03;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pessoa {
	protected String nome;
	protected String sexo;
	protected Date dataNascimento;
	public int idade;
	public int expectativa;
	
	public double imprimeTempoVidaRestante() {
	SimpleDateFormat dataNascimento = new SimpleDateFormat("dd/MM/yyyy"); 
	
	
		 if (this.sexo == "feminino") {
			 Calendar hoje = Calendar.getInstance();
			 int idade = hoje.get(Calendar.YEAR) - dataNascimento.getYear();
			    int mesAtual = hoje.get(Calendar.MONTH) + 1;
			    if ((mesAtual == dataNascimento.getMonth() && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.getDay())
			        || mesAtual < dataNascimento.getMonth()) {
			        idade--;
			        expectativa = 80 - idade;
			    }
		 }
		 if (this.sexo == "masculino") {
			 Calendar hoje = Calendar.getInstance();
			 int idade = hoje.get(Calendar.YEAR) - dataNascimento.getYear();
			    int mesAtual = hoje.get(Calendar.MONTH) + 1;
			    if ((mesAtual == dataNascimento.getMonth() && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.getDay())
			        || mesAtual < dataNascimento.getMonth()) {
			        idade--;
			        expectativa = 73 - idade;
			    }
		 }
		 return expectativa;	
		 
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	

}
