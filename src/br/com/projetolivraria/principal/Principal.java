package br.com.projetolivraria.principal;

import javax.swing.*;

public class Principal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel label1;
	
	public Principal() {
		
		super("testando JLabel");
		
		label1 = new JLabel("Nome: ");
		label1.setToolTipText("Texto de exemplo");
		setLayout(null);
		label1.setBounds(10, 10, 100, 30);
		add(label1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new Principal();
		
	}
	
	
}
