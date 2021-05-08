package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	public void antecessor() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um valor:");
		int valor = scan.nextInt();
	System.out.println("Valor digitado é: " + valor);	
		int antecessor = valor - 1;
	System.out.println("Valor antecessor é: " + antecessor);	
	
	}

}
