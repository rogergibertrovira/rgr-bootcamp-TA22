package controllers;

import javax.swing.JFrame;

import models.ModeloVideo;
import views.VistaMostrarVideo;

public class ControladorMostrarVideo {
	private ModeloVideo modelo;
	private VistaMostrarVideo vista;
	private ControladorExiste controladorExiste;

	public ControladorMostrarVideo(ModeloVideo mod, VistaMostrarVideo vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
	}

	public void iniciarVista(int id) {
		boolean existeVideo = modelo.consultarVideo(id);
		vista.setTitle("Mostrar video");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		if (existeVideo) {
			vista.setVisible(true);
			mostrarCliente(id);
		}else {
			controladorExiste.iniciarVista(2);
		}
	}

	public void mostrarCliente(int id) {
		vista.labelId.setText(Integer.toString(modelo.getId()));
		vista.labelTitulo.setText(modelo.getTitle());
		vista.labelDirector.setText(modelo.getDirector());
		if(modelo.getClienteId() == 0) {
			vista.labelClienteId.setText("-");
		}
		else {
			vista.labelClienteId.setText(Integer.toString(modelo.getClienteId()));	
		}
	}
}
