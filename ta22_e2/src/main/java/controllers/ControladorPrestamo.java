package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cliente;
import models.ModeloCliente;
import models.ModeloVideo;
import models.Video;
import views.VistaPrestamo;

public class ControladorPrestamo implements ActionListener {

	private ModeloCliente modeloCliente;
	private ModeloVideo modeloVideo;

	private VistaPrestamo vista;

	private ControladorExiste controladorExiste;

	private int idCliente, idVideo;

	public ControladorPrestamo(ModeloCliente mCliente, ModeloVideo mVideo, VistaPrestamo vis,
			ControladorExiste contExiste) {
		this.modeloCliente = mCliente;
		this.modeloVideo = mVideo;
		this.vista = vis;
		this.controladorExiste = contExiste;
		this.vista.buttonPrestar.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Prestamo video");
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonPrestar) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfCliente.getText()) && !"".equals(vista.tfVideo.getText())) {
				try {
					idCliente = Integer.parseInt(vista.tfCliente.getText());
					idVideo = Integer.parseInt(vista.tfVideo.getText());
					// Comprueba los formatos de los ids
					if (idCliente >= 0 && idVideo >= 0) {

						// Comprueba si existe el video y el cliente
						Video video = modeloVideo.consultarVideo(idVideo);
						Cliente cliente = modeloCliente.consultarCliente(idCliente);

						// Si existe el video y el cliente
						if (video.getId() > 0 && cliente.getId() > 0) {
							modeloVideo.prestarVideo(idCliente, idVideo);
							limpiarTextFields();
							vista.dispose();
						}
						// Si no existe el video
						else if (video.getId() <= 0) {
							controladorExiste.iniciarVista(2);
						}
						// Si no existe el cliente
						else if (cliente.getId() <= 0) {
							controladorExiste.iniciarVista(1);
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
		vista.tfCliente.setText("");
		vista.tfVideo.setText("");
	}
}
