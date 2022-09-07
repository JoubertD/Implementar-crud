package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	/**
	 * Constructor de la clase Archivo. Inicializa la clase
	 * @param archivo: el archivo que se vaya a utilizar
	 */
	
	
	public Archivo(File archivo) {
		if (archivo.exists()) {
		} else {
			try {
				archivo.createNewFile();

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	


	public void escribirArchivo(ArrayList<Persona> persona, File archivo) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(persona);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	public ArrayList<Persona> leerArchivo(File archivo) {
		ArrayList<Persona> persona = new ArrayList<Persona>();
		
		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				persona = (ArrayList<Persona>) entrada.readObject();
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return persona;
	}
}
