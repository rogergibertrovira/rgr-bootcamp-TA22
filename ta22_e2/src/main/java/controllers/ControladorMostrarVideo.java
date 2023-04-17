package controllers;

import javax.swing.JFrame;

import models.ModeloVideo;
import models.Video;
import views.VistaMostrarVideo;

public class ControladorMostrarVideo {
	private ModeloVideo modelo;
	private Video video;
	private VistaMostrarVideo vista;
	private ControladorExiste controladorExiste;

	public ControladorMostrarVideo(ModeloVideo mod, VistaMostrarVideo vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
	}

	public void iniciarVista(int id) {
		video = modelo.consultarVideo(id);
		vista.setTitle("Mostrar video");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		// Comprueba que video existe
		if (video.getId() > 0) {
			vista.setVisible(true);
			mostrarCliente(id);
		}else {
			controladorExiste.iniciarVista(2);
		}
	}

	public void mostrarCliente(int id) {
		vista.labelId.setText(Integer.toString(video.getId()));
		vista.labelTitulo.setText(video.getTitle());
		vista.labelDirector.setText(video.getDirector());
		if(video.getClienteId() == 0) {
			vista.labelClienteId.setText("-");
		}
		else {
			vista.labelClienteId.setText(Integer.toString(video.getClienteId()));	
		}
	}
}
