package luizacode.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public void apuracaoVotos() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o n�mero de eleitores do seu munic�pio:");
	int eleitores = scan.nextInt();
		
	//System.out.println("Digite o n�mero de votos v�lidos do seu munic�pio:");
	//int validos = scan.nextInt();
	
	System.out.println("Digite o n�mero de votos brancos do seu munic�pio:");
	int brancos = scan.nextInt();
	
	System.out.println("Digite o n�mero de votos nulos do seu munic�pio:");
	int nulos = scan.nextInt();
	
	int votosBrancos = brancos * 100 / eleitores;
	int votosNulos = nulos * 100 / eleitores;
	int votosValidos = (eleitores - (brancos + nulos)) * 100 / eleitores;
	
	System.out.println("Votos Brancos: " + votosBrancos + "%");
	System.out.println("Votos Nulos: " + votosNulos + "%");
	System.out.println("Votos V�lidos: " + votosValidos + "%");
	
	}
}
