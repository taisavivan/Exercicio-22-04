package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	public void area() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o valor da base do ret�ngulo");
	double base = scan.nextDouble();
	System.out.println("Digite o valor da altura do ret�ngulo");
	double altura = scan.nextDouble();
	double area = base * altura;
	System.out.println("A �rea do ret�ngulo �: " + area);	
	
	}
}
