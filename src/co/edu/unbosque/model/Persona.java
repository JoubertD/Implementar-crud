package co.edu.unbosque.model;

public class Persona {
	
	private String Nombre;
	private String Correo;
	private String Telefono;
	private String Id; 
	
	public Persona(String id ,String name, String correo, String telefono) {
		Nombre = name;
		Correo = correo;
		Telefono = telefono;
		Id = id;
	}
	
	public Persona() {
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return Correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Persona Nombre = " + Nombre + "\n Correo = " + Correo + "\n Telefono = " + Telefono + "\n Id = " + Id;
	}
	
	
	
	

}
