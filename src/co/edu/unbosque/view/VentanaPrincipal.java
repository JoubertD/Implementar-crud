package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	
	private PanelPrincipal panelP;
	private JButton arreglo, binario, sql ,salir, crear, actualizar, borrar, ver, buscar;
	private JLabel intro;
	
	
	public VentanaPrincipal() {

		setTitle("Proyecto DAO");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(59, 62, 68 ));
		setResizable(false);
		setLayout(new GridLayout(4,4));
		setLocationRelativeTo(null);
		arregloComponentes();

		setVisible(true);

	}
	
	/**
	 * inicializa los componentes de la ventana
	 * <b>pre</b> se ha inicializado la ventana<br>
	 * <b>post</b> se inicializaron los componentes de la ventana correctamente <br>
	 * 
	 */
	
	

	@SuppressWarnings("deprecation")
	public void arregloComponentes() {
		Font f = new Font("Times New Roman", Font.PLAIN, 30);
		

		arreglo = new JButton("Arreglo");
		
		arreglo.setBackground(Color.black);
		arreglo.setForeground(Color.lightGray);
		arreglo.setFont(f);
		arreglo.setBorderPainted(false);
		arreglo.setContentAreaFilled(true);
		arreglo.setFocusPainted(true);
		arreglo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		arreglo.setActionCommand("arreglo");
		getContentPane().add(arreglo);
		
		binario = new JButton("binario");


		binario.setFont(f);
		binario.setForeground(Color.lightGray);
		binario.setBackground(new Color(64, 65, 68 ));
		binario.setBorderPainted(false);
		binario.setContentAreaFilled(true);
		binario.setFocusPainted(true);
		binario.setCursor(new Cursor(Cursor.HAND_CURSOR));
		binario.setActionCommand("binario");
		getContentPane().add(binario);
		
		
		sql = new JButton("sql");


		sql.setFont(f);
		sql.setBackground(new Color(133, 135, 140 ));
		sql.setBorderPainted(false);
		sql.setContentAreaFilled(true);
		sql.setFocusPainted(true);
		sql.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sql.setActionCommand("sql");
		getContentPane().add(sql);

		salir = new JButton("Salir");
		salir.setFont(f);
		salir.setBackground(new Color(232, 232, 232  ));
		salir.setBorderPainted(false);
		salir.setContentAreaFilled(true);
		salir.setFocusPainted(true);
		salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		salir.setActionCommand("salir");
		getContentPane().add(salir);

	}
	
	public void cambiarVentana(String accion) {
		setLayout(new GridLayout(5,5));
		Font f = new Font("Times New Roman", Font.PLAIN, 20);
		
		getContentPane().remove(arreglo);
		getContentPane().remove(binario);
		getContentPane().remove(sql);
		getContentPane().remove(salir);
		

		
		setSize(1001, 701);
		
		crear = new JButton("Crear");
		

		crear.setBackground(Color.black);
		crear.setForeground(Color.lightGray);
		crear.setFont(f);
		crear.setBorderPainted(false);
		crear.setContentAreaFilled(true);
		crear.setFocusPainted(true);
		crear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		crear.setActionCommand("crear");
		getContentPane().add(crear);
		
		actualizar = new JButton("Actualizar");


		actualizar.setFont(f);
		actualizar.setForeground(Color.lightGray);
		actualizar.setBackground(new Color(64, 65, 68 ));
		actualizar.setBorderPainted(false);
		actualizar.setContentAreaFilled(true);
		actualizar.setFocusPainted(true);
		actualizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		actualizar.setActionCommand("actualizar");
		getContentPane().add(actualizar);
		
		
		borrar = new JButton("Borrar");


		borrar.setFont(f);
		borrar.setBackground(new Color(133, 135, 140 ));
		borrar.setBorderPainted(false);
		borrar.setContentAreaFilled(true);
		borrar.setFocusPainted(true);
		borrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		borrar.setActionCommand("borrar");
		getContentPane().add(borrar);
		
		ver = new JButton("Ver Personas");


		ver.setFont(f);
		ver.setBackground(new Color(225, 226, 230 ));
		ver.setBorderPainted(false);
		ver.setContentAreaFilled(true);
		ver.setFocusPainted(true);
		ver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		ver.setActionCommand("ver");
		getContentPane().add(ver);
		
		buscar = new JButton("Buscar Personas");


		buscar.setFont(f);
		buscar.setBackground(new Color(255, 255, 255  ));
		buscar.setBorderPainted(false);
		buscar.setContentAreaFilled(true);
		buscar.setFocusPainted(true);
		buscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buscar.setActionCommand("buscar");
		getContentPane().add(buscar);
		
		
		
		switch (accion) {
		case "arreglo":
			
			break;
		case "binario":
			
			break;
		case "sql":
			
			break;
		}
	}
	
	

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JButton getVer() {
		return ver;
	}

	public void setVer(JButton ver) {
		this.ver = ver;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JButton getArreglo() {
		return arreglo;
	}

	public void setArreglo(JButton arreglo) {
		this.arreglo = arreglo;
	}

	public JButton getBinario() {
		return binario;
	}

	public void setBinario(JButton binario) {
		this.binario = binario;
	}

	public JButton getSql() {
		return sql;
	}

	public void setSql(JButton sql) {
		this.sql = sql;
	}

	public JButton getarreglo() {
		return arreglo;
	}

	public void setarreglo(JButton arreglo) {
		this.arreglo = arreglo;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}
	
	

	
}
