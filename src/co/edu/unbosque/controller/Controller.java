package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.PersonaDAOArreglo;
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
	private PersonaDAOArreglo arreglo;
	private PersonaDAOSql sql;
	private ArrayList<Persona> listaBinario;
	private String seleccionado = "";
	

	public Controller() throws Exception {
		
		persona = new ArrayList<Persona>();
		
		ventanaPrincipal = new VentanaPrincipal();
		file = new File("Persona.dat");
		archivo = new Archivo(file);
		binario = new PersonaDAOBinario(file);
		arreglo = new PersonaDAOArreglo();
		sql = new PersonaDAOSql();
		sql.conectar();
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
			if(seleccionado.equals("arreglo")) {
				String id = ventanaEmergente.pedirDatos("Digite la identificacion:");
				String nombre = ventanaEmergente.pedirDatos("Escriba el nombre:");
				String correo = ventanaEmergente.pedirDatos("Escriba el correo:");
				String telefono = ventanaEmergente.pedirDatos("Escriba su Telefono:");
				Persona persona = new Persona(id,nombre,correo,telefono);
				arreglo.registrar(persona);
				ventanaEmergente.mostrarDatos("Persona agregada con exito");
			}else if(seleccionado.equals("binario")) {
				
			}else if(seleccionado.equals("sql")) {
				String id = ventanaEmergente.pedirDatos("Digite la identificacion:");
				String nombre = ventanaEmergente.pedirDatos("Escriba el nombre:");
				String correo = ventanaEmergente.pedirDatos("Escriba el correo:");
				String telefono = ventanaEmergente.pedirDatos("Escriba su Telefono:");
				Persona persona = new Persona(id,nombre,correo,telefono);
				sql.registrar(persona);
				ventanaEmergente.mostrarDatos("Persona agregada con exito");
			}else {
				ventanaEmergente.mostrarDatos("No se ha podido identificar el metodo");
			}
			break;
		case "actualizar":
			if(seleccionado.equals("arreglo")) {
				String id = ventanaEmergente.pedirDatos("Digite la identificacion:");
				String nombre = ventanaEmergente.pedirDatos("Escriba el nuevo nombre:");
				String correo = ventanaEmergente.pedirDatos("Escriba el nuevo correo:");
				String telefono = ventanaEmergente.pedirDatos("Escriba el nuevo Telefono:");
				arreglo.modificar(id, nombre, correo, telefono);
				ventanaEmergente.mostrarDatos("Persona modificada");
			}else if(seleccionado.equals("binario")) {
				
			}else if(seleccionado.equals("sql")) {
				String id = ventanaEmergente.pedirDatos("Digite la identificacion:");
				String nombre = ventanaEmergente.pedirDatos("Escriba el nuevo nombre:");
				String correo = ventanaEmergente.pedirDatos("Escriba el nuevo correo:");
				String telefono = ventanaEmergente.pedirDatos("Escriba el nuevo Telefono:");
				sql.modificar(id, nombre, correo, telefono);
				ventanaEmergente.mostrarDatos("Persona modificada");
			}else {
				ventanaEmergente.mostrarDatos("No se ha podido identificar el metodo");
			}
			break;
		case "borrar":
			if(seleccionado.equals("arreglo")) {
				String id = ventanaEmergente.pedirDatos("Ingrese el id de la persona a borrar");
				arreglo.eliminar(id);
				ventanaEmergente.mostrarDatos("Persona Eliminada");
			}else if(seleccionado.equals("binario")) {
				
			}else if(seleccionado.equals("sql")) {
				String id = ventanaEmergente.pedirDatos("Ingrese el id de la persona a borrar");
				sql.eliminar(id);
				ventanaEmergente.mostrarDatos("Persona Eliminada");
			}else {
				ventanaEmergente.mostrarDatos("No se ha podido identificar el metodo");
			}
			break;
		case "ver":
			ventanaEmergente.mostrarDatos("Datos personas: ");
			break;
		case "buscar":
			if(seleccionado.equals("arreglo")) {
				String id = ventanaEmergente.pedirDatos("Digite el Id de la persona buscada: ");
				try{
					Persona persona = arreglo.buscar(id);
					ventanaEmergente.mostrarDatos(persona.toString());
				}catch(Exception cualquiera) {
					ventanaEmergente.mostrarDatos("Persona no encontrada");
				}
				
			}else if(seleccionado.equals("binario")) {
				
			}else if(seleccionado.equals("sql")) {
				String id = ventanaEmergente.pedirDatos("Digite el Id de la persona buscada: ");
				Persona persona = sql.buscar(id);
				ventanaEmergente.mostrarDatos(persona.toString());
			}else {
				ventanaEmergente.mostrarDatos("No se ha podido identificar el metodo");
			}
			break;

		default:
			break;
		}
	}

}
