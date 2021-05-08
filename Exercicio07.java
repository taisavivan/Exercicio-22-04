package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	public void idade() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite sua idade: anos, meses e dias");
	int anos = scan.nextInt();
	int meses = scan.nextInt();
	int dias = scan.nextInt();
	
	dias += (anos * 365 + meses * 30);
	System.out.println("Sua idade em dias é: " + dias);
	
	}

}
