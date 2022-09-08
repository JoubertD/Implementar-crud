package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	
	private PanelPrincipal panelP;
	private JButton iniciar, salir;
	private JLabel intro;
	
	
	public VentanaPrincipal() {

		setTitle("Proyecto DAO");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(244, 196, 196));
		setResizable(false);
		setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		iniciarComponentes();

		setVisible(true);

	}
	
	/**
	 * inicializa los componentes de la ventana
	 * <b>pre</b> se ha inicializado la ventana<br>
	 * <b>post</b> se inicializaron los componentes de la ventana correctamente <br>
	 * 
	 */
	
	

	@SuppressWarnings("deprecation")
	public void iniciarComponentes() {

		panelP = new PanelPrincipal();
		getContentPane().add(panelP);

		iniciar = new JButton();
		
		iniciar.setBounds(360, 530, 100, 50);
		iniciar.setBorderPainted(false);
		iniciar.setContentAreaFilled(true);
		iniciar.setFocusPainted(true);
		iniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		iniciar.setActionCommand("INICIAR");
		getContentPane().add(iniciar);

		salir = new JButton();
		salir.setBounds(510, 530, 100, 50);
		salir.setBorderPainted(false);
		salir.setContentAreaFilled(true);
		salir.setFocusPainted(true);
		salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		salir.setActionCommand("SALIR");
		getContentPane().add(salir);
		
	

		

	}

	
}
