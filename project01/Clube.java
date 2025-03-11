package Exercises;

import java.util.*;

public class ClubeCorrigido {
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
        double renda, mensalidadeCat1 = 300, mensalidadeCat2 = 0, mensalidadeCat3 = 0, total = 0;

        for (int i = 0; i < NumSoc; i++) {
            System.out.print("\n\nDigite sua idade: ");
            age = sc.nextInt();
            System.out.print("Qual seu sexo? [M/F] ");
            sex = sc.next();
            System.out.print("Qual sua renda mensal? R$");
            renda = sc.nextDouble();

            if (age >= 18 && age <= 65 && sex.equalsIgnoreCase("M") && renda > 1000) {
                c1++;
                mensalidadeCat1 = 300;
                total += mensalidadeCat1;
                System.out.println("Você está inserido na Categoria 1!, o valor da sua mensalidade é de R$" + mensalidadeCat1);
            } else if (age > 65 && sex.equalsIgnoreCase("F")) {
                mensalidadeCat2 = 300 * 0.75;
                c2++;
                total += mensalidadeCat2;
                System.out.println("Você está inserido na Categoria 2!, o valor da sua mensalidade é de R$" + mensalidadeCat2);
            } else {
                mensalidadeCat3 = 300 * 1.10;
                c3++;
                total += mensalidadeCat3;
                System.out.println("Você está inserido na Categoria 3!, o valor da sua mensalidade é de R$" + mensalidadeCat3);
            }
            System.out.println("\n-----------------------------------------------------------------------------------------");
        }
        sc.close();
        System.out.printf("\nValor total arrecadado dos sócios: R$%,.2f\n", total);
    }
}
