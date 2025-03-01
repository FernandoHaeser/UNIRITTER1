package project01;

import javax.swing.JOptionPane;

public class AgeTest {
	public static void main(String[] args) {

		String prod = """

				[1] Carnes
				[2] Bebidas
				[3] Doces
				[4] Grãos
				[5] Sair

				""";

		JOptionPane.showMessageDialog(null, "Seja bem-vindo ao sistema do supermercado FH");
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu produto: " + prod));

		switch (opcao) {
		case 1:
			String carnes = """

					   [1] Bovina
					   [2] Branca
					   [3] Porco

					""";

			int carnesop = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu produto: " + carnes));

			switch (carnesop) {
			case 1:

				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço da carne:"));
				int qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço da carne está " + valor + "R$, levára quantas quantidades?"));

				int total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carne bovina, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carnes bovinas, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null,
							"Você comprou " + qntd + " de carnes bovinas, por " + total + "R$");
					break;

				}

			case 2:

				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço da carne:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço da carne está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carne branca, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carnes brancas, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null,
							"Você comprou " + qntd + " de carne branca, por " + total + "R$");

					break;
				}

			case 3:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço da carne:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço da carne está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carne de porco, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " carnes de porco, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null,
							"Você comprou " + qntd + " de carnes de porco, por " + total + "R$");

					break;
				}
				break;
			}
			break;	
		case 2:

			String bebidas = """

					   [1] Refris
					   [2] Sucos
					   [3] Águas

					""";

			int bebidasop = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu produto: " + bebidas));

			switch (bebidasop) {
			case 1:
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do refri:"));
				int qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do refri está " + valor + "R$, levára quantas quantidades?"));

				int total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " refri, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " refris, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " refris, por " + total + "R$");

					break;
				}

			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do suco:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do suco está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " suco, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " sucos, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " sucos, por " + total + "R$");

					break;
				}

			case 3:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço da água:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço da água está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " água, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " águas, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " águas, por " + total + "R$");

					break;

				}
				break;
			}
			break;
		case 3:
			String doces = """

					   [1] Chocolates
					   [2] Pirulitos
					   [3] Balas

					""";

			int docesop = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu produto: " + doces));

			switch (docesop) {
			case 1:
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do chocolate:"));
				int qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do chocolate está " + valor + "R$, levára quantas quantidades?"));

				int total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " chocolate, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " chocolates, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " chocolates, por " + total + "R$");
					break;
				}

			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do pirulito:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do pirulito está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " pirulito, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " pirulitos, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " pirulitos, por " + total + "R$");
					break;

				}

			case 3:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do pirulito:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do pirulito está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " bala, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " balas, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " balas, por " + total + "R$");
					break;

				}
				break;
			}
			break;
		case 4:
			String grãos = """

					   [1] Pães
					   [2] Cereais
					   [3] Salgados

					""";

			int grãosop = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu produto: " + grãos));

			switch (grãosop) {
			case 1:
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do Pão:"));
				int qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do pão está " + valor + "R$, levára quantas quantidades?"));

				int total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null, "Você está comprando " + qntd + "pão, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " pães, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " pães, por " + total + "R$");
					break;
				}

			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do Cereal:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do cereal está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " cereal, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " cereais, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " cereais, por " + total + "R$");
					break;

				}

			case 3:
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o preço do Salgado:"));
				qntd = Integer.parseInt(JOptionPane.showInputDialog(null,
						"O preço do salgado está " + valor + "R$, levára quantas quantidades?"));

				total = (valor * qntd);

				if (qntd == 1) {
					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " salgado, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);
				} else {

					JOptionPane.showMessageDialog(null,
							"Você está comprando " + qntd + " salgados, pelo preço de: " + total);
					int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação",
							JOptionPane.YES_NO_OPTION);

					JOptionPane.showMessageDialog(null, "Você comprou " + qntd + " salgados, por " + total + "R$");
					break;

				}

			}

			break;

		case 5:
			int resposta = JOptionPane.showConfirmDialog(null, "Confirmar?", "Confirmação", JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Então por favor, reinicie o algoritmo ");

			} else {
				JOptionPane.showMessageDialog(null, "Você saiu do algoritmo!");
			}
		}

		JOptionPane.showMessageDialog(null, "Obrigado por usar o algoritmo FH! @fernaandooy");

	}

}
