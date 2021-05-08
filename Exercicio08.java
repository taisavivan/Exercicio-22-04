package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public void apuracaoVotos() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o número de eleitores do seu município:");
	int eleitores = scan.nextInt();
		
	//System.out.println("Digite o número de votos válidos do seu município:");
	//int validos = scan.nextInt();
	
	System.out.println("Digite o número de votos brancos do seu município:");
	int brancos = scan.nextInt();
	
	System.out.println("Digite o número de votos nulos do seu município:");
	int nulos = scan.nextInt();
	
	int votosBrancos = brancos * 100 / eleitores;
	int votosNulos = nulos * 100 / eleitores;
	int votosValidos = (eleitores - (brancos + nulos)) * 100 / eleitores;
	
	System.out.println("Votos Brancos: " + votosBrancos + "%");
	System.out.println("Votos Nulos: " + votosNulos + "%");
	System.out.println("Votos Válidos: " + votosValidos + "%");
	
	}
}
