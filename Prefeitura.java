package Exercises;

import java.util.Scanner;

public class Prefeitura {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * A PREFEITURA DE UMA CIDADE FEZ UMA PESQUISA ENTRE SEUS HABITANTES, COLETANDO
		 * DADOS SOBRE O SALÁRIO E NÚMERO DE FILHOS. A PREFEITURA DESEJA SABER:
		 * 
		 * MÉDIA DO SALÁRIO DA POPULAÇÃO; MÉDIA DO NÚMERO DE FILHOS MAIOR SALÁRIO;
		 * 
		 * PERCENTUAL DE PESSOAS COM SALÁRIO ATÉ R$200,00. O FINAL DA LEITURA DE DADOS
		 * SE DARÁ COM A ENTRADA DE UM SALÁRIO NEGATIVO.
		 */

		double LimiteSal = 500000;
		double Sal, medSal = 0, medFilhos = 0, MSal = 0, SomaSal = 0, SomaFil = 0;
		int filhos, cont;

		for (cont = 1; cont <= 10; cont++) {

			do {
				System.out.println("-----------------------------------------");
				System.out.print("\n" + cont + ". Qual seu salário? R$");
				Sal = sc.nextDouble();

				if (Sal < LimiteSal) {
					SomaSal = SomaSal + Sal;

					if (Sal > MSal) {
						MSal = Sal;
					}

				}

				if (Sal < 0) {
					System.out.println("O salário não pode ser negativo!");

				} else if (Sal > LimiteSal) {
					System.out.println("O salário não pode ser superior a R$" + LimiteSal);
				}

			} while (Sal < 0 || Sal > LimiteSal);

			do {

				System.out.println("-----------------------------------------");
				System.out.print("\n"+ cont + ". Quantos filhos você tem? ");
				filhos = sc.nextInt();

				if (filhos > 0) {
					SomaFil = SomaFil + filhos;
				}

				if (filhos < 0) {
					System.out.println("Digite um número de filhos válido!");
				}
				System.out.println("-----------------------------------------");
			} while (filhos < 0);
			
			System.out.println(".");
			System.out.println(". INDO DE " +  cont + " PARA " + (cont+1));
			System.out.println(".");
			
		}

		medSal = SomaSal / cont;
		medFilhos = SomaFil / cont;


		System.out.println("-----------------------------------------");
		System.out.println("O salário médio da população é: R$%,.2f" + medSal);
		System.out.println("A média do número de filhos da população é: " + medFilhos);
		System.out.println("O maior salário registrado foi de: R$%,.2f" + MSal);
		System.out.println("-----------------------------------------");

		System.exit(0);
	}
	
}
