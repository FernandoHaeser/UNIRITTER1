package ExercisesAula4PSC;

import java.util.Random;

/* Faça um algoritmo que receba 15000
números inteiros e verifique quantos desses números
são Pares (Um número é PAR quando dividido por 2 seu resto é igual a zero).
Apresente o final dessa quantidade.
 */

/* .Faça um algoritmo que receba 1500 números inteiros
e verifique quantos desses números são Ímpares
(Um número é ÍMPAR quando dividido por 2 seu resto é igual a 1).
Apresente o final dessa quantidade.
 */

// Juntei os dois!

public class Ex3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] num = new int[15000];
        int pares = 0, impares = 0;

        for (int i = 0; i < num.length; i++ ) {
            num[i] = random.nextInt(100);
            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Ao total, tivemos " + pares + " números pares, e "  + impares + " números ímpares");
    }
}
