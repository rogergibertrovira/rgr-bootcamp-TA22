package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	// -----------------------------------------------------------------
	public Connection openConnection(Connection conexion) {
		conexion = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.12:3306", "remote", "Newton_1");
			System.out.println("Conectado a la base de datos");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error de conexion");
		}

		return conexion;
	}

	// -----------------------------------------------------------------
	public void createDatabase(String nom, Connection conexion) {

		try {
			String Query = "CREATE DATABASE " + nom;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			openConnection(conexion);
		} catch (SQLException e) {
			System.out.println("Error abriendo la conexion " + e);
		}
	}

	// -----------------------------------------------------------------
	public void closeConnection(Connection conexion) {
		try {
			conexion.close();
			System.out.println("Cerrada la conexion");
		} catch (SQLException e) {
			System.out.println("Error cerrando la conexion: " + e);
		}
	}

	// -----------------------------------------------------------------
	public void createTable(String db, String table, String atributos, Connection conexion) {
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			// CREATE TABLE
			Statement st = conexion.createStatement();
			st.executeUpdate("CREATE TABLE " + table + "(" + atributos + ");");
			System.out.println("Table creada: " + table);

		} catch (SQLException e) {
			System.out.println("Error creando la table: " + e);
		}
	}

	// -----------------------------------------------------------------
	public void insertData(String db, String table, String columns, String atributos, Connection conexion) {
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			Statement st = conexion.createStatement();
			st.executeUpdate("INSERT INTO " + table + "(" + columns + ") VALUE(" + atributos + ");");
			System.out.println("data insertada: " + atributos);

		} catch (SQLException e) {
			System.out.println("Error insertando data: " + e);
		}
	}

	// -----------------------------------------------------------------
	public boolean modifyData(String db, String table, String atributos, int id, Connection conexion) {
		boolean actualizadoCorrecto = false;
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			Statement st = conexion.createStatement();
			int correcto = st.executeUpdate("UPDATE " + table + " SET " + atributos + " WHERE id=" + id + ";");

			if (correcto >= 1) {
				actualizadoCorrecto = true;
			}

		} catch (SQLException e) {
			System.out.println("Error insertando data: " + e);
		}
		return actualizadoCorrecto;
	}

	// -----------------------------------------------------------------
	public java.sql.ResultSet getSingleValue(String db, String table, int id, Connection conexion) {
		java.sql.ResultSet resultSet = null;
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			String querySelect = "SELECT * FROM " + table + " WHERE id=" + id + ";";
			Statement stsel = conexion.createStatement();

			resultSet = stsel.executeQuery(querySelect);

		} catch (SQLException e) {
			System.out.println("Values no coleccionadas correctamente:" + e);
		}
		return resultSet;
	}

	// -----------------------------------------------------------------
	public java.sql.ResultSet getValues(String db, String table, Connection conexion) {
		java.sql.ResultSet resultSet = null;
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			String querySelect = "SELECT * FROM " + table + ";";
			Statement stsel = conexion.createStatement();

			resultSet = stsel.executeQuery(querySelect);

		} catch (SQLException e) {
			System.out.println("Values no coleccionadas correctamente:" + e);
		}
		return resultSet;
	}

	public boolean deleteDatabase(String db, String table, int id, Connection conexion) {
		boolean borradoCorrecto = false;
		try {
			// USE database
			String queryDB = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

			String query = "DELETE FROM " + table + " WHERE id=" + id + ";";
			Statement delTable = conexion.createStatement();

			// Comprueba si se ha borrado
			int delete = delTable.executeUpdate(query);
			if (delete >= 1) {
				borradoCorrecto = true;
			}

		} catch (SQLException e) {
			System.out.println("Values not deleted correctly");
		}
		return borradoCorrecto;
	}

	public void dropDatabase(String db, Connection conexion) {
		try {
			String queryDB = "DROP DATABASE IF EXISTS " + db;
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDB);

		} catch (SQLException ex) {
			System.out.println("Drop incomplete");
		}
	}
}