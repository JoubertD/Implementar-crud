package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelPrincipal extends JFrame {
	private JLabel fondo;
	private JTextField nickname;
	private JButton continuar, salir;
	
	
	/**
	 * Constructor del PanelRegistro. Inicializa el panel
	 */

	public PanelPrincipal() {
		setSize(1000, 700);
		setBackground(Color.gray);
		setLayout(null);
		setVisible(false);
		iniciarComponentes();
	}
	
	/**
	 * inicializa los componentes del panel
	 * <b>pre</b> se ha inicializado el panel<br>
	 * <b>post</b> se inicializaron los componentes del panel correctamente <br>
	 * 
	 */
	
	

	public void iniciarComponentes() {
		
		

		nickname = new JTextField();
		nickname.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		nickname.setBounds(423, 350, 200, 35);
		nickname.setFont(new Font("Agency FB", Font.ITALIC, 18));
		add(nickname);

		salir = new JButton();
		salir.setBounds(965, 5, 30, 30);
		salir.setBorderPainted(false);
		salir.setContentAreaFilled(false);
		salir.setFocusPainted(true);
		salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		salir.setActionCommand("SALIR8");
		add(salir);

		continuar = new JButton();	
		continuar.setBounds(470, 400, 100, 50);
		continuar.setBorderPainted(false);
		continuar.setContentAreaFilled(false);
		continuar.setFocusPainted(true);
		continuar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		continuar.setActionCommand("REGISTRAR");
		add(continuar);


		fondo = new JLabel();
		fondo.setSize(1000, 700);
		fondo.setVisible(true);
		add(fondo);

	}
}
