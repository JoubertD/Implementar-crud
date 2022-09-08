package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.PersonaDAOBinario;
import co.edu.unbosque.view.VentanaEmergente;
import co.edu.unbosque.view.VentanaPrincipal;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.persistence.PersonaDAOSql;

public class Controller implements ActionListener {
	
	private VentanaPrincipal ventanaPrincipal;
	private VentanaEmergente ventanaEmergente;
	
	private ArrayList<Persona> persona;
	private File file;
	private Archivo archivo;
	private PersonaDAOBinario binario;
	private ArrayList<Persona> listaBinario;
	

	public Controller() throws Exception {
		persona = new ArrayList<Persona>();
		
		ventanaPrincipal = new VentanaPrincipal();
		
		file = new File("Persona.dat");
		archivo = new Archivo(file);
		binario = new PersonaDAOBinario(file);
		listaBinario = archivo.leerArchivo(file);
		ventanaEmergente = new VentanaEmergente();

		asignarOyentes();
	}

	/**
	 * Asigna los oyentes a cada uno de los componentes de manera que estos tenga un accion asignada
	 * <b>pre</b> se ha inicializado la clase<br>
	 * <b>post</b> se asignaron los oyentes a los componentes de la vista correctamente <br>
	 */
	
	
	public void asignarOyentes() {
		ventanaPrincipal.getSalir().addActionListener(this);
		ventanaPrincipal.getarreglo().addActionListener(this);
		ventanaPrincipal.getBinario().addActionListener(this);
		ventanaPrincipal.getSql().addActionListener(this);
	}
	
	public void inicializarCrud() {
		ventanaPrincipal.getCrear().addActionListener(this);
		ventanaPrincipal.getBorrar().addActionListener(this);
		ventanaPrincipal.getActualizar().addActionListener(this);
		ventanaPrincipal.getVer().addActionListener(this);
		ventanaPrincipal.getBuscar().addActionListener(this);
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
		String seleccionado = null;
		switch (accion) {
		case "arreglo":
			ventanaPrincipal.cambiarVentana(accion);
			seleccionado = accion;
			inicializarCrud();
			break;
		case "binario":
			ventanaPrincipal.cambiarVentana(accion);
			seleccionado = accion;
			inicializarCrud();
			break;
		case "sql":
			ventanaPrincipal.cambiarVentana(accion);
			seleccionado = accion;
			inicializarCrud();
			break;
		case "crear":
			
			break;
		case "actualizar":
			
			break;
		case "borrar":
			
			break;
		case "ver":
			ventanaEmergente.mostrarDatos("Datos personas: ");
			break;
		case "buscar":
			
			break;

		default:
			break;
		}
	}

}
