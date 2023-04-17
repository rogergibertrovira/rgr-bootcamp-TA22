package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModeloVideo;
import models.Video;
import views.VistaDevolver;

public class ControladorDevolver implements ActionListener {

	private ModeloVideo modelo;

	private VistaDevolver vista;

	private ControladorExiste controladorExiste;

	private int idCliente, idVideo;

	public ControladorDevolver(ModeloVideo mVideo, VistaDevolver vis, ControladorExiste contExiste) {
		this.modelo = mVideo;
		this.vista = vis;
		this.controladorExiste = contExiste;
		this.vista.buttonDevolver.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Devolver video");
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonDevolver) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfVideo.getText())) {
				try {
					idVideo = Integer.parseInt(vista.tfVideo.getText());
					// Comprueba los formatos de los ids
					if (idCliente >= 0 && idVideo >= 0) {

						// Comprueba si existe el video
						Video video = modelo.consultarVideo(idVideo);

						// Si existe el video
						if (video.getId() > 0) {
							modelo.devolverVideo(idVideo);
							limpiarTextFields();
							vista.dispose();
						}
						// Si no existe el video
						else {
							controladorExiste.iniciarVista(2);
						}
					} else {
						throw new NumberFormatException("Numero negativo");
					}
				} catch (NumberFormatException ex) {
					System.out.println(ex);
				}
			}
		}
	}

	public void limpiarTextFields() {
		vista.tfVideo.setText("");
	}
}
