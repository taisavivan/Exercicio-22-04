package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	public void valorCarro() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica desse carro?");
		double custo = scan.nextDouble();
			
		double custoFinal = custo + (custo * 45/100f) + (custo * 28/100f);
		
		System.out.println("Valor para consumidor final é: R$ " + custoFinal);
	}

}
