package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAOArreglo implements DAO{
	
	private ArrayList<Persona> Personas = new ArrayList<Persona>();

	@Override
	public void registrar(Persona persona) {
		// TODO Auto-generated method stub
		Personas.add(persona);
	}

	@Override
	public void modificar(String id, String npersona, String correo, String telefono) {
		// TODO Auto-generated method stub
		for(int i=0; i < Personas.size();i++) {
			if(Personas.get(i).getId().equals(id)) {
				Personas.remove(i);
				Personas.add(new Persona(id, npersona,correo,telefono));
			}
		}
	}

	@Override
	public void eliminar(String persona) {
		// TODO Auto-generated method stub
		if(Personas != null) {
			for(int i=0; i < Personas.size();i++) {
				if(Personas.get(i).getId().equals(persona)) {
					Personas.remove(i);
				}
			}
		}
		
	}

	@Override
	public Persona buscar(String npersona) {
		// TODO Auto-generated method stub
		Persona personabuscada = null;
		for(int i=0; i < Personas.size();i++) {
			if(Personas.get(i).getId().equals(npersona)) {
				personabuscada = Personas.get(i);
			}
		}
		return personabuscada;
	}

	/**
	 * @return the personas
	 */
	public ArrayList<Persona> getPersonas() {
		return Personas;
	}

	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(ArrayList<Persona> personas) {
		Personas = personas;
	}
	
	

}
