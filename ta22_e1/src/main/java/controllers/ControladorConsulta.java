package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaConsulta;

public class ControladorConsulta implements ActionListener {

	private VistaConsulta vista;
	private ControladorMostrar controladorMostrar;

	// Atributos de cliente necesarios
	private int id;

	public ControladorConsulta(VistaConsulta vis, ControladorMostrar contMostrar) {
		this.vista = vis;
		this.vista.buttonConsultar.addActionListener(this);
		this.controladorMostrar = contMostrar;
	}

	public void iniciarVista() {
		vista.setTitle("Consultar cliente");
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonConsultar) {
			// Si el campo de id no está vacio
			if (!"".equals(vista.tfId.getText())) {
				try {
					id = Integer.parseInt(vista.tfId.getText());
					// Comprueba el formato del id
					if (id >= 0) {
						controladorMostrar.iniciarVista(id);
						limpiarTextFields();
						vista.dispose();
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
