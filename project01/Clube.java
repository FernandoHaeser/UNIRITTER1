package Exercises;

import java.util.*;

public class Clube {
	public static void main(String[] args) {

		/*
		 * FAÇA UM ALGORITMO QUE RECEBE AS INFORMAÇÕES IDADE, SEXO E RENDA MENSAL DE
		 * 1000 SÓCIOS DE UM CLUBE. EXISTEM 3 CATEGORIAS PARA CADA TIPO DE SÓCIO E
		 * MENSALIDADES.
		 * 
		 * PARA CATEGORIA 1 O VALOR DA MENSALIDADE É R$ 300,00 | PESSOAS COM IDADE ENTRE
		 * 18 E 65 ANOS DO SEXO MASCULINO COM RENDA MAIOR QUE R$ 1.000,00.
		 * 
		 * PARA CATEGORIA 2 O VALOR DA MENSALIDADE É 25% MENOR QUE A CATEGORIA 1 |
		 * PESSOAS COM MAIS DE 65 ANOS DO SEXO FEMININO.
		 * 
		 * PARA CATEGORIA 3 O VALOR DA MENSALIDADE É 10% MAIOR QUE A CATEGORIA 1 |
		 * DEMAIS PESSOAS. APRESENTE NA TELA O VALOR TOTAL ARRECADADO COM 1 MENSALIDADE
		 * DE CADA SÓCIO.
		 */

		Scanner sc = new Scanner(System.in);

		int age, NumSoc = 10, c1 = 0, c2 = 0, c3 = 0;
		String sex;
		double renda, mensalidade = 300, total = 0, totC1 = 0, totC2 = 0, totC3 = 0;

		for (int i = 0; i < NumSoc; i++) {
			System.out.print("\n\nDigite sua idade: ");
			age = sc.nextInt();
			System.out.print("Qual seu sexo? [M/F] ");
			System.out.print("R: ");
			sex = sc.nextLine();
			sex = sc.nextLine();
			System.out.print("Qual sua renda mensal? R$");
			renda = sc.nextDouble();

			if (age >= 18 || age < 65 && sex.equals("M") && renda > 1000) {
				c1 = c1 + 1;
				totC1 = c1 * mensalidade;
				System.out.println(
						"Você está inserido na Categoria 1!, o valor da sua mensalidade é de R$" + mensalidade);
				System.out.println(
						"\n-----------------------------------------------------------------------------------------");
			} else if (age > 65 && sex.equals("F")) {
				mensalidade = (75 * mensalidade) / 100;
				c2 = c2 + 1;
				totC2 = c2 * mensalidade;
				System.out.println(
						"Você está inserido na Categoria 2!, o valor da sua mensalidade é de R$" + mensalidade);
				System.out.println(
						"\n-----------------------------------------------------------------------------------------");

			} else {
				mensalidade = mensalidade * 1.1;
				c3 = c3 + 1;
				totC3 = c3 * mensalidade;
				System.out.println(
						"Você está inserido na Categoria 3!, o valor da sua mensalidade é de R$" + mensalidade);
				System.out.println(
						"\n-----------------------------------------------------------------------------------------");

			}
		}

		total = totC1 + totC2 + totC3;
		System.out.print("\nValor total arrecadado dos sócios: R$ %2,.nf" + total);

	}
}
