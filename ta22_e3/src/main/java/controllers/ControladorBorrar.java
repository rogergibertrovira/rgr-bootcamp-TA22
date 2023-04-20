package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaBorrar;

import models.ModeloProyecto;
import models.ModeloCientifico;
import models.ModeloAsignadoA;

public class ControladorBorrar implements ActionListener {

	private ModeloProyecto modeloP;
	private ModeloCientifico modeloC;
	private ModeloAsignadoA modeloA;

	private VistaBorrar vista;

	// Atributos de cliente necesarios
	private String id;
	private int opcion;

	public ControladorBorrar(ModeloProyecto modP, ModeloCientifico modC, ModeloAsignadoA modA, VistaBorrar vis) {
		this.modeloP = modP;
		this.modeloC = modC;
		this.modeloA = modA;

		this.vista = vis;

		this.vista.buttonBorrar.addActionListener(this);
	}

	public void iniciarVista(int opcion) {
		this.opcion = opcion;
		vista.setInfo(opcion);
		if (opcion == 1) {
			vista.setTitle("Borrar proyecto");
		} else if (opcion == 2) {
			vista.setTitle("Borrar cientifico");
		} else if (opcion == 3) {
			vista.setTitle("Borrar asignacion");
		}
		vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonBorrar) {
			// Si el campo de id no está vacio
			if (!"".equals(vista.tfId.getText())) {
				id = vista.tfId.getText();
				if (opcion == 1) {
					modeloP.borrarProyecto(id);
					System.out.println(id);
				} else if (opcion == 2) {
					modeloC.borrarCientifico(id);
				} else if (opcion == 3) {
					modeloA.borrarAsignadoA(id);
				}
				vista.limpiarTextFields();
				vista.dispose();
			}
		}
	}

	public void limpiarTextFields() {
		vista.tfId.setText("");
	}
}
