package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class ModeloProyecto {

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

	public void inserirProyecto(String id, String nombre, int horas) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String columnas = "id, nombre, horas";
		String datosProyecto = "'" + id + "','" + nombre + "','" + horas + "'";

		// Inserta el proyecto a la base de datos
		db.insertData("mvc3", "proyectos", columnas, datosProyecto, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarProyecto(String id) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();

		// Borra el proyecto de la base de datos
		borrado = db.deleteDatabase("mvc3", "proyectos", id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public Proyecto consultarProyecto(String id) {
		Proyecto proyecto = new Proyecto();

		// Inicia la conexion
		conectarDatabase();

		String datosProyecto = "'" + id + "'";
		// Recoge los datos del proyecto de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc3", "proyectos", datosProyecto, conexion);

		try {
			if (resultSet.next() != false) {
				do {
					proyecto.setId(resultSet.getString("id"));
					proyecto.setNombre(resultSet.getString("nombre"));
					proyecto.setHoras(resultSet.getInt("horas"));

				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return proyecto;
	}

	public boolean actualizarProyecto(String id, String nombre, int horas) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosProyecto = "id='" + id + "', nombre='" + nombre + "', horas='" + horas + "'";

		// Actualiza los datos del proyecto
		existe = db.modifyData("mvc3", "proyectos", datosProyecto, id, conexion);

		// Cierra la conexion
		cerrarConexion();

		return existe;
	}
}
