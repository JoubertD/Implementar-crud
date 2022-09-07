package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Persona;

public interface DAO {
	
	public void registrar(Persona persona);
	public void modificar(String npersona, String correo, String telefono, String id);
	public void eliminar(Persona persona);
	public Persona buscar(String npersona);

}
