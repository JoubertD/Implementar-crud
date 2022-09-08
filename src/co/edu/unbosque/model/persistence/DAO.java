package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Persona;

public interface DAO {
	
	public void registrar(Persona persona);
	public void modificar(String npersona, String correo, String telefono, String id);
	public void eliminar(String npersona);
	public Persona buscar(String npersona);

}
