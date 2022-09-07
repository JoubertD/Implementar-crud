package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAO {
	private Archivo archivo;


	
	public PersonaDAO(File file) {
		archivo = new Archivo(file);

	}

	public String mostrarPersona(String persona) {
		String texto = "";

		Persona objEntrenador = new Persona();

		texto = texto.concat(objEntrenador.toString() + "\n");

		return texto;
	}


	public Persona buscarPersona(String pEntrenador, String nombre, ArrayList<Persona> persona) {
		Persona encontrado = null;
		if (!persona.isEmpty()) {
			for (int i = 0; i < persona.size(); i++) {
				if (nombre.equals(persona.get(i).getNombre())) {
					encontrado = persona.get(i);
				}
			}
		}
		return encontrado;
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
}
