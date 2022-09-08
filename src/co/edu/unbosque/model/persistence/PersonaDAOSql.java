package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAOSql {
	String url ="persona.db";
	Connection conexion;
	public void conectar() {
		try {
			conexion=DriverManager.getConnection("jdbc:sqlite:" + url);
			if(conexion!=null) {
				System.out.println("Conexion Exitosa");
			}
		}catch(SQLException exception) {
			System.out.println("No se pudo establecer la conexion: " + exception);
		}
	}
	public void cerrarConexion() {
		try {
			conexion.close();
		}catch(SQLException exception) {
			Logger.getLogger(PersonaDAOSql.class.getName()).log(Level.SEVERE,null,exception);
		}
	}

}
