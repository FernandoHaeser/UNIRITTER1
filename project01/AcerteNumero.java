package Jogos;

import java.util.*;
import javax.swing.*;

public class AcerteNumero {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
            if (num > number) {
                JOptionPane.showMessageDialog(null, "Menor!!!");
            } else if (num < number) {
                JOptionPane.showMessageDialog(null, "Maior!!!");
            }
        } while (num != number);
        JOptionPane.showMessageDialog(null, "VOCÊ ACERTOUUUUUUUUUUUUU!");
        JOptionPane.showMessageDialog(null, "Obrigado por jogar ;) -> @fernaandooy");
        
    }
}
