package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import database.Database;

public class ModeloCliente {

	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private LocalDate fecha;

	private Connection conexion;
	private Database db;

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}

	public LocalDate getFecha() {
		return fecha;
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

	
	public void inserirCliente(String nombre, String apellido, String direccion, int dni, LocalDate fecha) {
		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
		String datosCliente = this.id + ",'" + this.nombre + "','" + this.apellido + "','" + this.direccion + "',"
				+ this.dni + ",'" + this.fecha + "'";

		// Inserta el cliente a la base de datos
		db.insertData("mvc", "clientes", datosCliente, conexion);

		// Cierra la conexion
		cerrarConexion();
	}

	public boolean borrarCliente(int id) {
		boolean borrado = false;

		// Inicia la conexion
		conectarDatabase();

		// Borra el cliente de la base de datos
		borrado = db.deleteDatabase("mvc", "clientes", id, conexion);

		// Cierra la conexion
		cerrarConexion();
		return borrado;
	}

	public boolean consultarCliente(int id) {
		boolean existe = false;
		// Inicia la conexion
		conectarDatabase();

		// Recoge los datos del cliente de la base de datos
		ResultSet resultSet = db.getSingleValue("mvc", "clientes", id, conexion);

		try {
			if (resultSet.next() != false) {
				System.out.println("HOLA");
				existe = true;
				do {
					System.out.println(2);
					this.id = resultSet.getInt("id");
					this.nombre = resultSet.getString("nombre");
					this.apellido = resultSet.getString("apellido");
					this.direccion = resultSet.getString("direccion");
					this.dni = resultSet.getInt("dni");
					Date fechaDate = resultSet.getDate("fecha");
					this.fecha = fechaDate.toLocalDate();
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception " + e);
		}

		// Cierra la conexion
		cerrarConexion();
		return existe;
	}

	public boolean actualizarCliente(int id, String nombre, String apellido, String direccion, int dni,
			LocalDate fecha) {
		boolean existe = false;

		// Inicia la conexion
		conectarDatabase();

		// Genera la cadena de datos para inserir
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
		String datosCliente = "nombre='" + this.nombre + "', apellido='" + this.apellido + "', direccion='"
				+ this.direccion + "', dni=" + this.dni + ", fecha='" + this.fecha + "'";

		// Actualiza los datos del cliente
		existe = db.modifyData("mvc", "clientes", datosCliente, id, conexion);

		// Cierra la conexion
		cerrarConexion();

		return existe;
	}
}
