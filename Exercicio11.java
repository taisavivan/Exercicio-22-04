package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public void calculoSalario() {
		
	Scanner scan = new Scanner(System.in);

			System.out.println("Insira valor do sal�rio mensal: ");
			double salario = scan.nextDouble();
	
			System.out.println("Insira valor da comiss�o por venda: ");
			double comissaoFixa = scan.nextDouble();
			
			System.out.println("Insira a quantidade de carros vendidos no m�s: ");
			double quantidadeCarroVendido = scan.nextDouble();
			
			System.out.println("Insira valor monet�rio total de vendas do m�s: ");
			double valorTotalVenda = scan.nextDouble();
			
					
			double comissaoVenda = quantidadeCarroVendido * comissaoFixa + valorTotalVenda * 5/100;
			double salariofinal = salario + comissaoVenda;
			
			System.out.println("Seu salario do m�s �: R$" + salariofinal);
			
			
		}
			
}
