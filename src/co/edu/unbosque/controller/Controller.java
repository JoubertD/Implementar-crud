package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.persistence.PersonaDAOSql;

public class Controller implements ActionListener {
	
	public Controller() {
		funcionar();
	}
	
	private void funcionar() {
		PersonaDAOSql Sql = new PersonaDAOSql();
		Sql.conectar();
		Persona prueba1 = new Persona("12345","David","algo.com","32098123");
		Sql.registrar(prueba1);
		prueba1 = new Persona("98765","Daniel","algo.com","32098123");
		Sql.registrar(prueba1);
		Sql.eliminar("12345");
		Sql.cerrarConexion();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String accion = e.getActionCommand();
		
	}

}
