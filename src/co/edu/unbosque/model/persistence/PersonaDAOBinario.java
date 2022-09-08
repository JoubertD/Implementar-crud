package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAOBinario implements DAO{
	private Archivo archivo;

	public PersonaDAOBinario(File file) {
		archivo = new Archivo(file);

	}
	
	
	public Boolean crearPersona(String id, String nombre, String correo, String telefono,
			ArrayList<Persona> personas, File file) {
		
		personas.add(new Persona(id,nombre,correo,telefono));
		try {
			archivo.escribirArchivo(personas, file);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

	public Persona buscarPersona(String id, File file) {
		Persona p = null;

		ArrayList<Persona> objPersona= archivo.leerArchivo(file);
		
		for (int i = 0; i < objPersona.size(); i++) {
			if(objPersona.get(i).getId().equals(id)) {
				p = objPersona.get(i);
			}
		}


		return p;
	}


	public Persona buscarPersona(String id, ArrayList<Persona> persona) {
		Persona encontrado = null;
		if (!persona.isEmpty()) {
			for (int i = 0; i < persona.size(); i++) {
				if (id.equals(persona.get(i).getId())) {
					encontrado = persona.get(i);
				}
			}
		}
		return encontrado;
	}
	
	public  ArrayList<Persona> borrarPersona(String nombre, ArrayList<Persona> persona) {
		if (!persona.isEmpty()) {
			for (int i = 0; i < persona.size(); i++) {
				if (nombre.equals(persona.get(i).getNombre())) {
					persona.remove(i);
				}
			}
		} return persona;
	}
	
	public ArrayList<Persona> actualizarPersona(String id ,String name, String correo, String telefono,
			ArrayList<Persona> persona) {
		
		Persona encontrado = buscarPersona(id, persona);
		if(encontrado != null) {
			for (int i = 0; i < persona.size(); i++) {
				if(encontrado == persona.get(i)) {
					persona.set(i, new Persona(id,name,correo,telefono));
				}
			}
		}
		return persona;
	}


	/**
	 * @return the archivo
	 */
	public Archivo getArchivo() {
		return archivo;
	}

	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	@Override
	public void registrar(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String npersona, String correo, String telefono, String id) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void eliminar(String npersona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona buscar(String npersona) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
