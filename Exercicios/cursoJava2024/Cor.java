package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cor extends JFrame {

	public void TrocaCorFundo() {
		setTitle("Troca de Cor de Fundo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel painel = new JPanel();
		add(painel);

		JButton botaoVermelho = new JButton("Vermelho");
		JButton botaoAzul = new JButton("Azul");
		JButton botaoVerde = new JButton("Verde");
		JButton botaoBlack = new JButton("Black");

		botaoVermelho.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.RED);
			}
		});

		botaoAzul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.BLUE);
			}
		});

		botaoVerde.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.GREEN);
			}
		});
		botaoBlack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.BLACK);
			}
		});

		painel.add(botaoVermelho);
		painel.add(botaoAzul);
		painel.add(botaoVerde);
		painel.add(botaoBlack);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Cor();
	}
}
