package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	
	public void salario() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário mensal:");
		double salario = scan.nextDouble();
			
		System.out.println("Digite o % de reajuste:");
		double reajuste = scan.nextDouble();
		
		double salarioAjustado = salario * (1 + reajuste/100f);
		
		System.out.println("Seu novo salário é: R$ " + salarioAjustado);

	}

}
