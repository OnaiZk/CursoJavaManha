package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC3 extends JFrame {
    public IMC3() {
        setTitle("IMC");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton botao = new JButton("Calcule seu imc aqui!");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pesoS = JOptionPane.showInputDialog("Digite o Peso (KG):");
                double peso = Double.parseDouble(pesoS);

                String alturaS = JOptionPane.showInputDialog("Digite a altura (m):");
                double altura = Double.parseDouble(alturaS);

                double imc = peso / (altura * altura);

                String quadrisS = JOptionPane.showInputDialog("Digite a circunferência dos quadris (em cm): ");
                double quadris = Double.parseDouble(quadrisS);

                String alturaaS = JOptionPane.showInputDialog("Digite a altura (em metros): ");
                double altura2 = Double.parseDouble(alturaaS);

                double iac = (quadris / (altura * Math.sqrt(altura))) - 18;

                String mensagem = String.format("Seu IMC é: %.2f%nSeu IAC é: %.2f", imc, iac);
                JOptionPane.showMessageDialog(null, mensagem);
            }
        });

        add(botao);

        setVisible(true);
    }

    public static void main(String[] args) {
        new IMC3();
    }
}