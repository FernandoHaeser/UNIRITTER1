package Exercises;

public class Luiz {
	public static void main(String[] args) {

		/*
		 * LUIZ TEM 1,50 METRO E CRESCE 2 CENTÍMETROS POR ANO, ENQUANTO MARIA TEM 1,10
		 * METRO E CRESCE 3 CENTÍMETROS POR ANO. CONSTRUA UM ALGORITMO UTILIZANDO UMA
		 * ESTRUTURA DE REPETIÇÃO QUE CALCULE E IMPRIMA QUANTOS ANOS SERÃO NECESSÁRIOS
		 * PARA QUE MARIA SEJA MAIS ALTA QUE LUIZ.
		 */

		double hL, hM;
		int year = 0;

		for (hL = 150, hM = 110; hM <= hL; year++) {
			hL += 2;
			hM += 3;
		}
		
		System.out.print("Vão ser necessário " + year + " anos para Maria ser mais alta que Luiz");
	}
}
