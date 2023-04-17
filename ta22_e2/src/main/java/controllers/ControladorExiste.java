package controllers;

import javax.swing.JFrame;

import views.VistaExiste;

public class ControladorExiste {

	private VistaExiste vista;

	public ControladorExiste(VistaExiste vis) {
		this.vista = vis;
	}

	public void iniciarVista(int opcion) {
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);

		if (opcion == 1) {
			vista.setTitle("Cliente inexistente");
			vista.labelInfo.setText("Este cliente no existe");
		} else if (opcion == 2) {
			vista.setTitle("Video inexistente");
			vista.labelInfo.setText("Este video no existe");
		}
	}
}
