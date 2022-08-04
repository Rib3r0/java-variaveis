package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		//criar as variaveis
		double juros, capital, taxa, tempo;
		Scanner leitor;//cria o Scanner
		//pega a entrada
		leitor = new Scanner(System.in);
		
		//pega o valor do capital
		System.out.print("Qual o seu capital?: ");
		capital = leitor.nextDouble();//chama a entrada
		//pega o valor do juros
		System.out.print("Qual a taxa de juros?: ");
		taxa = leitor.nextDouble();
		//pega o tempo
		System.out.print("Quantos meses?: ");
		tempo = leitor.nextDouble();
		
		//calculo
		juros = (capital * taxa * tempo) / 100;
		//invia o resultado
		System.out.printf("O valor do juros é de R$%s e terá um total de R$%s", juros, juros + capital);
	
		
	}

}
