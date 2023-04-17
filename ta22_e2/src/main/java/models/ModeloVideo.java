package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class ModeloVideo {
	
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

	public void inserirVideo(String title, String director) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		String columnas = "title, director";
		String datosVideo = "'" + title + "','" + director + "'";

		// Inserta el video a la base de datos
		db.insertData("mvc2", "videos", columnas, datosVideo, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarVideo(int id) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();

		// Borra el video de la base de datos
		borrado = db.deleteDatabase("mvc2", "videos", id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public Video consultarVideo(int id) {
		Video video = new Video();
		// Inicia la conexion
		conectarDatabase();

		// Recoge los datos del video de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc2", "videos", id, conexion);

		try {
			if (resultSet.next() != false) {
				do {
					video.setId(resultSet.getInt("id"));
					video.setTitle(resultSet.getString("title"));
					video.setDirector(resultSet.getString("director"));
					video.setClienteId(resultSet.getInt("cli_id"));
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return video;
	}

	public boolean actualizarVideo(int id, String title, String director) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosVideo = "title='" + title + "', director='" + director + "'";

		// Actualiza los datos del video
		existe = db.modifyData("mvc2", "videos", datosVideo, id, conexion);

		// Cierra la conexion
		cerrarConexion();

		return existe;
	}

	public boolean prestarVideo(int idCliente, int idVideo) {
		boolean prestamoCorrecto = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosVideo = "cli_id='" + idCliente + "'";
		
		// Actualiza los datos del video
		prestamoCorrecto = db.modifyData("mvc2", "videos", datosVideo, idVideo, conexion);

		// Cierra la conexion
		cerrarConexion();

		return prestamoCorrecto;
	}
	
	public boolean devolverVideo(int idVideo) {
		boolean devolucionCorrecta = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		String datosVideo = "cli_id=null";
		
		// Actualiza los datos del video
		devolucionCorrecta = db.modifyData("mvc2", "videos", datosVideo, idVideo, conexion);

		// Cierra la conexion
		cerrarConexion();

		return devolucionCorrecta;
	}
}
