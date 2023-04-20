package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class ModeloCientifico {

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

	public void inserirCientifico(String dni, String nomApels) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String columnas = "dni, nomApels";
		String datosCientifico = "'" + dni + "','" + nomApels + "'";

		// Inserta el cientifico a la base de datos
		db.insertData("mvc3", "cientificos", columnas, datosCientifico, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarCientifico(String dni) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();

		// Borra el cientifico de la base de datos
		borrado = db.deleteDatabaseDNI("mvc3", "cientificos", dni, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public Cientifico consultarCientifico(String dni) {
		Cientifico cientifico = new Cientifico();
		// Inicia la conexion
		conectarDatabase();
		
		String datosCientifico = "'" + dni + "'";
		
		// Recoge los datos del cientifico de la base de datos
		ResultSet resultSet = db.getSingleValueDNI("mvc3", "cientificos", datosCientifico, conexion);

		try {
			if (resultSet.next() != false) {
				do {
					cientifico.setDni(resultSet.getString("dni"));
					cientifico.setNomApels(resultSet.getString("nomApels"));
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return cientifico;
	}

	public boolean actualizarCientifico(String dni, String nomApels) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosCientifico = "dni='" + dni + "', nomApels='" + nomApels + "'";

		// Actualiza los datos del cientifico
		existe = db.modifyDataDNI("mvc3", "cientificos", datosCientifico, dni, conexion);

		// Cierra la conexion
		cerrarConexion();

		return existe;
	}
}
