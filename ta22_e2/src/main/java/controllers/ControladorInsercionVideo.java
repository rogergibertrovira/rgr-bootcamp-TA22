package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModeloVideo;
import views.VistaInsercionVideo;

public class ControladorInsercionVideo implements ActionListener {

	private ModeloVideo modelo;
	private VistaInsercionVideo vista;

	// Atributos de video necesarios
	private int id;
	private String titulo;
	private String director;

	public ControladorInsercionVideo(ModeloVideo mod, VistaInsercionVideo vis) {
		this.modelo = mod;
		this.vista = vis;
		this.vista.buttonInserir.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Inserir video");
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonInserir) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfTitulo.getText()) && !"".equals(vista.tfDirector.getText())) {
				try {
					id = Integer.parseInt(vista.tfId.getText());
					// Comprueba el formato del id
					if (id >= 0) {
						titulo = vista.tfTitulo.getText();
						director = vista.tfDirector.getText();
						modelo.inserirVideo(titulo, director);
						limpiarTextFields();
						vista.dispose();
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
