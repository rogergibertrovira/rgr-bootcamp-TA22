package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import database.Database;

public class ModeloCliente {

	private Connection conexion;
	private Database db;

	// Abre la conexion con base de datos MySQL
	public void conectarDatabase() {
		conexion = null;
		db = new Database();
		conexion = db.openConnection(conexion);
	}

	// Cierra la conexion con base de datos MySQL
	public void cerrarConexion() {
		db.closeConnection(conexion);
	}

	public void inserirCliente(String nombre, String apellido, String direccion, int dni, LocalDate fecha) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String columnas = "nombre, apellido, direccion, dni, fecha";
		String datosCliente = "'" + nombre + "','" + apellido + "','" + direccion + "'," + dni + ",'" + fecha + "'";

		// Inserta el cliente a la base de datos
		db.insertData("mvc2", "clientes", columnas, datosCliente, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarCliente(int id) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();

		// Borra el cliente de la base de datos
		borrado = db.deleteDatabase("mvc2", "clientes", id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public Cliente consultarCliente(int id) {
		Cliente cliente = new Cliente();
		// Inicia la conexion
		conectarDatabase();

		// Recoge los datos del cliente de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc2", "clientes", id, conexion);

		try {
			if (resultSet.next() != false) {
				do {
					cliente.setId(resultSet.getInt("id"));
					cliente.setNombre(resultSet.getString("nombre"));
					cliente.setApellido(resultSet.getString("apellido"));
					cliente.setDireccion(resultSet.getString("direccion"));
					cliente.setDni(resultSet.getInt("dni"));
					Date fechaDate = resultSet.getDate("fecha");
					cliente.setFecha(fechaDate.toLocalDate());
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return cliente;
	}

	public boolean actualizarCliente(int id, String nombre, String apellido, String direccion, int dni,
			LocalDate fecha) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String datosCliente = "nombre='" + nombre + "', apellido='" + apellido + "', direccion='" + direccion
				+ "', dni=" + dni + ", fecha='" + fecha + "'";

		// Actualiza los datos del cliente
		existe = db.modifyData("mvc2", "clientes", datosCliente, id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return existe;
	}
}
