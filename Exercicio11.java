package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public void calculoSalario() {
		
	Scanner scan = new Scanner(System.in);

			System.out.println("Insira valor do salário mensal: ");
			double salario = scan.nextDouble();
	
			System.out.println("Insira valor da comissão por venda: ");
			double comissaoFixa = scan.nextDouble();
			
			System.out.println("Insira a quantidade de carros vendidos no mês: ");
			double quantidadeCarroVendido = scan.nextDouble();
			
			System.out.println("Insira valor monetário total de vendas do mês: ");
			double valorTotalVenda = scan.nextDouble();
			
					
			double comissaoVenda = quantidadeCarroVendido * comissaoFixa + valorTotalVenda * 5/100;
			double salariofinal = salario + comissaoVenda;
			
			System.out.println("Seu salario do mês é: R$" + salariofinal);
			
			
		}
			
}
