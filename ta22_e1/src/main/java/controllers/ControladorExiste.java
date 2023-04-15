package controllers;

import javax.swing.JFrame;

import views.VistaExiste;

public class ControladorExiste {

	private VistaExiste vista;

	public ControladorExiste(VistaExiste vis) {
		this.vista = vis;
	}

	public void iniciarVista() {
		vista.setTitle("Cliente inexistente");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}
}
