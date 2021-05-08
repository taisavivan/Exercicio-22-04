package luizacode.exercicios;

public class Exercicio04 {
	
	public void letraA() {
		double resultado1 = 6*(3+2);
		double resultado2 = 6*5;
		
		print("A", resultado1, resultado2); 
				
		}
	
	
	public void letraB() {
		double resultado1 = 2*(6*(3+2));
		double resultado2 = 2*30;
	
		print("B", resultado1, resultado2); 
		
	}
	
	public void letraC() {
		double resultado1 = 2+(3*6)/(2+4);
		double resultado2 = 2+18/6;
	
		print("C", resultado1, resultado2); 
		
	}
	
	public void letraD() {
		double resultado1 = 2*(8/(3+1));
		double resultado2 = 2*2;
	
		print("D", resultado1, resultado2); 
		
	}
	
	public void letraE() {
		double resultado1 = 3+(16-2)/(2*(9-2));
		double resultado2 = 3+14/14;
	
		print("E", resultado1, resultado2); 
		
	}
	
	public void letraF() {
		double resultado1 = (6/3)+(8/2);
		double resultado2 = 2+4;
	
		print("F", resultado1, resultado2); 
		
	}
	
	public void letraG() {
		double resultado1 = ((3+(8/2))*4)+(3*2);
		double resultado2 = 28+6;
	
		print("G", resultado1, resultado2); 
		
	}
	
	public void letraH() {
		double resultado1 = (6*(3*3)+6)-10;
		double resultado2 = 6*9+6-10;
	
		print("H", resultado1, resultado2); 
		
	}
	
	public void letraI() {
		double resultado1 = (((10*8)+3)*9);
		double resultado2 = 83*9;
	
		print("I", resultado1, resultado2); 
		
	}
	
	public void letraJ() {
		double resultado1 = ((-12)*(-4))+(3*(-4));
		double resultado2 = 48+-12;
	
		print("J", resultado1, resultado2); 
		
	}
	
	
	public void print(String letra, double resultado1, double resultado2) {
		
		
		System.out.println("Letra " + letra);
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
	}
	
	

}
