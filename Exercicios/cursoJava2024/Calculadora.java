package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    public Calculadora() {
        setTitle("CALCULADORA");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton botao = new JButton("Calcule");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String numeroS1 = JOptionPane.showInputDialog("Número 1:");
                    double numero1 = Double.parseDouble(numeroS1);

                    String numeroS2 = JOptionPane.showInputDialog("Número 2:");
                    double numero2 = Double.parseDouble(numeroS2);

                    double resultado = numero1 + numero2;

                    String mensagem = String.format("O resultado é: %.2f", resultado);
                    JOptionPane.showMessageDialog(null, mensagem);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                }
            }
        });

        add(botao);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
