package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorDeCliques extends JFrame {
    private int contador;
    private JLabel labelContador;
    private JButton botaoClique;

    public ContadorDeCliques() {
        contador = 0;

        setTitle("Contador de Cliques");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelContador = new JLabel("Clique no botão: " + contador);
        add(labelContador);

        botaoClique = new JButton("Clique aqui");
        add(botaoClique);

        botaoClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                labelContador.setText("Clique no botão: " + contador);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ContadorDeCliques());
    }
}
