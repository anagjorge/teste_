package Exercicio02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		
		System.out.println("Digite quantos números deseja inserir");
		int n = leitor.nextInt();
		int qtd[] = new int [n];  
		
		int i = 0;
		int pares = 0;
		if(qtd[i] %2 ==0 ) {
			pares ++;
		}
		int impares = 0;
		if(qtd[i] % 2 == 1) {
			impares ++;
		}
		int qtdRepetido = 0;
		if(qtd[i] == qtd[i]) {
			System.out.println("Os repetidos são:" + qtd[i]);
			qtdRepetido++;
		}	
			
		
		System.out.println("Pares:" + pares);
		System.out.println("Impares:" + impares);
		System.out.println("Quantidade repetidos:" +qtdRepetido);
		}

}
