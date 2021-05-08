package luizacode.exercicios;

public class Exercicio03 {
	
	public void comparacao() {
	
	String valor1 = "Resultado 1 = ";
	String valor2 = " Resultado 2 = ";
	String comparativo = " Comparativo = ";
	
	double result1 = (4.0/2)+(2.0/4);
	double result2 = 4.0/2+2.0/4;
	boolean comparaValoresA = (result1 == result2);
	
	double result3 = 4.0/(2+2)/4;
	double result4 = 4.0/2+2.0/4;
	boolean comparaValoresB = (result3 == result4);
	
	double result5 = (4+2)*2-4;
	double result6 = 4+2*2-4;
	boolean comparaValoresC = (result5 == result6);
	
	
	System.out.println("LetraA: " + valor1 + result1 + valor2 + result2 + comparativo + comparaValoresA);
	System.out.println("LetraB: " + valor1 + result3 + valor2 + result4 + comparativo + comparaValoresB);
	System.out.println("LetraC: " + valor1 + result5 + valor2 + result6 + comparativo + comparaValoresC);
}

}