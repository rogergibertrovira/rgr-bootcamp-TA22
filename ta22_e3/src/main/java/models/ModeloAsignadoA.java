package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class ModeloAsignadoA {

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

	public void inserirAsignadoA(String id, String proyecto, String cientifico) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String columnas = "id, proyecto, cientifico";
		String datosAsignadoA = "'" + id + "','" + proyecto + "','" + cientifico + "'";

		// Inserta el video a la base de datos
		db.insertData("mvc3", "asignadoA", columnas, datosAsignadoA, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarAsignadoA(String id) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();
		
		// Borra el video de la base de datos
		borrado = db.deleteDatabase("mvc3", "asignadoA", id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public AsignadoA consultarAsignadoA(String id) {
		AsignadoA asignadoA = new AsignadoA();
		// Inicia la conexion
		conectarDatabase();

		String datosAsignadoA = "'" + id + "'";
		// Recoge los datos del video de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc3", "asignadoA", datosAsignadoA, conexion);

		try {
			if (resultSet.next() != false) {
				do {
					asignadoA.setId(resultSet.getString("id"));
					asignadoA.setProyectoId(resultSet.getString("proyecto"));
					asignadoA.setCientificoId(resultSet.getString("cientifico"));
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return asignadoA;
	}

	public boolean actualizarAsignadoA(String id, String proyecto, String cientifico) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosAsignadoA = "id='" + id + "', proyecto='" + proyecto + "', cientifico='" + cientifico + "'";

		// Actualiza los datos del video
		existe = db.modifyData("mvc3", "asignadoA", datosAsignadoA, id, conexion);

		// Cierra la conexion
		cerrarConexion();

		return existe;
	}
}
