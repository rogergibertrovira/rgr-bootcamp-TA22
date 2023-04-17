package models;

public class Video {

	private int id;
	private String title;
	private String director;
	private int clienteId;

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
}
