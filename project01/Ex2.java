package ExercisesAula4PSC;

import java.util.Scanner;
/* 2. Faça um algoritmo que receba 3 notas 1000 alunos.
Para cada aluno deve ser calculada a média e  Caso a média seja maior que 6 informa "Aprovado", entre 4 e 6 em "Recuperação"
e menor que 4 "Reprovado". No final apresenta a média das médias dos 1000 alunos.
 */

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] aluno = new double[1000];
        double med = 0, notaA, notaB, notaC;

        for (int i = 0; i < aluno.length; i++) {

            System.out.println("\nDigite as 3 notas abaixo do aluno " + (i + 1));

            do {
                System.out.print("\nA: ");
                notaA = sc.nextDouble();
                if (notaA > 10 || notaA < 0) {
                    System.out.println("Digite um valor válido!");
                }
            } while(notaA > 10 || notaA < 0);

            do {
                System.out.print("\nB: ");
                notaB = sc.nextDouble();
                if (notaB > 10 || notaB < 0) {
                    System.out.println("Digite um valor válido!");
                }
            } while(notaB > 10 || notaB < 0);

            do {
                System.out.print("\nC: ");
                notaC = sc.nextDouble();
                if (notaC > 10 || notaC < 0) {
                    System.out.println("Digite um valor válido!");
                }
            } while(notaC > 10 || notaC < 0);

            aluno[i]= (notaA + notaB + notaC) / 3;

        }

        System.out.println("\nMédia dos alunos:");
        for (int i = 0; i < aluno.length; i++) {
            System.out.printf("A média do aluno %d foi de: %,.2f%n", (i + 1), aluno[i]); // %,.2f%n lembrar desse definidor de casa decimal, USAR COM "printf"
            if(aluno[i] > 6) {
                System.out.println("Está aprovado!");
            } else if(aluno[i] > 4 && aluno[i] <= 6) {
                System.out.println("Está em recuperação!");
            } else {
                System.out.println("Está reprovado!");
            }
        }
        sc.close();
    }
}
