package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class ModeloVideo {

	private int id;
	private String title;
	private String director;
	private int clienteId;

	private Connection conexion;
	private Database db;

	// Getters
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getClienteId() {
		return clienteId;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

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
		this.title = title;
		this.director = director;
		String datosVideo = this.id + ",'" + this.title + "','" + this.director + "'";

		// Inserta el video a la base de datos
		db.insertData("mvc2", "videos", datosVideo, conexion);

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

	public boolean consultarVideo(int id) {
		boolean existe = false;
		// Inicia la conexion
		conectarDatabase();

		// Recoge los datos del video de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc2", "videos", id, conexion);

		try {
			if (resultSet.next() != false) {
				existe = true;
				do {
					this.id = resultSet.getInt("id");
					this.title = resultSet.getString("title");
					this.director = resultSet.getString("director");
					this.clienteId = resultSet.getInt("cli_id");
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return existe;
	}

	public boolean actualizarVideo(int id, String title, String director) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para actualizar
		this.title = title;
		this.director = director;
		String datosVideo = "title='" + this.title + "', director='" + this.director + "'";

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
		this.clienteId = idCliente;
		String datosVideo = "cli_id='" + this.clienteId + "'";
		
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
