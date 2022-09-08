package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.unbosque.model.Persona;

public class PersonaDAOSql implements DAO{
	String url ="C:\\Users\\Joubert\\Desktop\\sqlite-tools-win32-x86-3390300\\personas.db";
	Connection conexion;
	Statement stat;
	public void PersonaDaoSql(){
		
	}
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
	@Override
	public void registrar(Persona persona){
		// TODO Auto-generated method stub
		try {
			stat = conexion.createStatement();
		//	stat.executeUpdate("drop table if exists persona;");
		//	stat.executeUpdate("create table persona(Id, Nombre, Correo, Telefono);");
			PreparedStatement preparar = conexion.prepareStatement("insert into persona values (?,?,?,?);");
			preparar.setString(1, persona.getId());
			preparar.setString(2, persona.getNombre());
			preparar.setString(3, persona.getCorreo());
			preparar.setString(4, persona.getTelefono());
			preparar.addBatch();
			conexion.setAutoCommit(false);
			preparar.executeBatch();
			conexion.setAutoCommit(true);
			ResultSet resultados= stat.executeQuery("select * from persona;");
			while(resultados.next()) {
	//			System.out.println("Identificacion: " + resultados.getString("Id"));
	//			System.out.println("Nombre: " + resultados.getString("Nombre"));
	//			System.out.println("Correo: " + resultados.getString("Correo"));
	//			System.out.println("Telefono: " + resultados.getString("Telefono"));
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void modificar(String npersona, String correo, String telefono, String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eliminar(String npersona) {
		// TODO Auto-generated method stub
		try {
			stat = conexion.createStatement();
			ResultSet resultados= stat.executeQuery("select * from persona;");
			System.out.println("En el borrar");
			while(resultados.next()) {
				if(resultados.getString("Id").equals(npersona)) {
					stat.executeUpdate("Delete from persona where Id = '" + npersona + "';");
				}
			}
			resultados= stat.executeQuery("select * from persona;");
			while(resultados.next()) {
				System.out.println("Identificacion: " + resultados.getString("Id"));
				System.out.println("Nombre: " + resultados.getString("Nombre"));
				System.out.println("Correo: " + resultados.getString("Correo"));
				System.out.println("Telefono: " + resultados.getString("Telefono"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Persona buscar(String npersona) {
		// TODO Auto-generated method stub
		return null;
	}

}
