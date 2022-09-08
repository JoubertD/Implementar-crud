package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class VentanaEmergente {
	
	public VentanaEmergente() {
		Font f = new Font("Georgia", Font.BOLD, 17);
		Color c1 = new Color(126, 118, 118 );
		Color c2 = new Color(75, 73, 73 );
		Color c3 = new Color(255, 255, 255 );
		
		UIManager.put("OptionPane.background", Color.black);
		UIManager.put("Panel.background", Color.black);
		UIManager.put("OptionPane.messageForeground", c1);
		UIManager.put("OptionPane.messageFont", f);
		UIManager.put("Button.foreground",c1);
		UIManager.put("Button.background",Color.black);
		UIManager.put("Button.font",f);
		UIManager.put("OptionPane.minimumSize",new Dimension(350,200));
		UIManager.put("OptionPane.background", c1);
		UIManager.put("Panel.background", Color.black);
		UIManager.put("Button.select", new Color(66, 52, 9));
	}
	
	public String pedirDatos(String dato) {
		return JOptionPane.showInputDialog(dato);		
	}
	
	public void mostrarDatos(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
