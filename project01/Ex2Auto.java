package ExercisesAula4PSC;

import java.util.Random;

/* 2. Faça um algoritmo que receba 3 notas 1000 alunos.
Para cada aluno deve ser calculada a média e Caso a média seja maior que 6 informa "Aprovado", entre 4 e 6 em "Recuperação"
e menor que 4 "Reprovado". No final apresenta a média das médias dos 1000 alunos.
 */

public class Ex2Auto {
    public static void main(String[] args) {

        Random random = new Random();
        double[] aluno = new double[1000];
        double notaA, notaB, notaC;

        for (int i = 0; i < aluno.length; i++) {

            //System.out.println("\nDigite as 3 notas abaixo do aluno " + (i + 1));

            do {
                //System.out.print("\nA: ");
                notaA = random.nextDouble(10) + 1;
                if (notaA > 10 || notaA < 0) {
                    //System.out.println("Digite um valor válido!");
                }
            } while (notaA > 10 || notaA < 0);

            do {
                //System.out.print("\nB: ");
                notaB = random.nextDouble(10) + 1;
                if (notaB > 10 || notaB < 0) {
                    //System.out.println("Digite um valor válido!");
                }
            } while (notaB > 10 || notaB < 0);

            do {
                //System.out.print("\nC: ");
                notaC = random.nextDouble(10) + 1;
                if (notaC > 10 || notaC < 0) {
                    //System.out.println("Digite um valor válido!");
                }
            } while (notaC > 10 || notaC < 0);

            aluno[i] = (notaA + notaB + notaC) / 3;

        }

        System.out.println("\nMédia dos alunos:");
        for (int i = 0; i < aluno.length; i++) {
            System.out.printf("A média do aluno %d foi de: %,.2f%n", (i + 1), aluno[i]); // %,.2f%n lembrar desse definidor de casa decimal, USAR COM "printf"

        }
    }
}
