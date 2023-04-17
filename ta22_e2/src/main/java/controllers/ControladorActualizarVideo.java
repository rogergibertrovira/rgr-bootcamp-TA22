package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import models.ModeloVideo;
import views.VistaActualizarVideo;

public class ControladorActualizarVideo implements ActionListener {

	private ModeloVideo modelo;
	private VistaActualizarVideo vista;
	private ControladorExiste controladorExiste;

	// Atributos de video necesarios
	private int id;
	private String titulo;
	private String director;

	public ControladorActualizarVideo(ModeloVideo mod, VistaActualizarVideo vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
		this.vista.buttonActualizar.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Actualizar video");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonActualizar) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfTitulo.getText()) && !"".equals(vista.tfDirector.getText())) {
				try {
					id = Integer.parseInt(vista.tfId.getText());
					// Comprueba el formato del id
					if (id >= 0) {
						titulo = vista.tfTitulo.getText();
						director = vista.tfDirector.getText();
						boolean videoExiste = modelo.actualizarVideo(id, titulo, director);
						limpiarTextFields();
						vista.dispose();
						if (!videoExiste) {
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
		vista.tfId.setText("");
		vista.tfTitulo.setText("");
		vista.tfDirector.setText("");
	}
}
