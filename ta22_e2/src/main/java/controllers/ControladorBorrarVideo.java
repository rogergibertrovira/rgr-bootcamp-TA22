package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import models.ModeloVideo;
import views.VistaBorrarVideo;

public class ControladorBorrarVideo implements ActionListener {

	private ModeloVideo modelo;
	private VistaBorrarVideo vista;
	private ControladorExiste controladorExiste;

	// Atributos de video necesarios
	private int id;

	public ControladorBorrarVideo(ModeloVideo mod, VistaBorrarVideo vis, ControladorExiste contExiste) {
		this.modelo = mod;
		this.vista = vis;
		this.controladorExiste = contExiste;
		this.vista.buttonBorrar.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Borrar video");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonBorrar) {
			// Si el campo de id no está vacio
			if (!"".equals(vista.tfId.getText())) {
				try {
					id = Integer.parseInt(vista.tfId.getText());
					// Comprueba el formato del id
					if (id >= 0) {
						boolean existe = modelo.borrarVideo(id);
						limpiarTextFields();
						vista.dispose();
						if (!existe) {
							controladorExiste.iniciarVista(2);
						}
					} else {
						throw new NumberFormatException("Numero negativo");
					}
				} catch (NumberFormatException ex) {
					System.out.println("ERROR FORMATO");
				}
			}
		}
	}
	
	public void limpiarTextFields() {
		vista.tfId.setText("");
	}
}
