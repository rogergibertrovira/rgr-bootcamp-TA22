package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaConsulta;

public class ControladorConsulta implements ActionListener {

	private VistaConsulta vista;
	private ControladorMostrar controladorMostrar;

	// Atributos de cliente necesarios
	private String id;
	private int opcion;

	public ControladorConsulta(VistaConsulta vis, ControladorMostrar contMostrar) {
		this.vista = vis;
		this.vista.buttonConsultar.addActionListener(this);
		this.controladorMostrar = contMostrar;
	}

	public void iniciarVista(int opcion) {
		this.opcion = opcion;
		// Proyecto
		if (opcion == 1) {
			vista.setTitle("Consultar proyecto");
			vista.setInfo(1);
		}
		// Cientifico
		else if (opcion == 2) {
			vista.setTitle("Consultar cientifico");
			vista.setInfo(2);
		}
		// AsignadoA
		else if (opcion == 3) {
			vista.setTitle("Consultar asignacion");
			vista.setInfo(3);
		}
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonConsultar) {
			// Si el campo de id no está vacio
			if (!"".equals(vista.tfId.getText())) {
				id = vista.tfId.getText();
				// Comprueba el formato del id
				if (this.opcion == 1) {
					controladorMostrar.iniciarVista(id, this.opcion);
				} else if (this.opcion == 2) {
					controladorMostrar.iniciarVista(id, this.opcion);
				} else if (this.opcion == 3) {
					controladorMostrar.iniciarVista(id, this.opcion);
				}
				vista.limpiarTextFields();
				vista.dispose();
			}
		}
	}
}
