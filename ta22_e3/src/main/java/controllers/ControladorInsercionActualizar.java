package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModeloProyecto;
import models.ModeloCientifico;
import models.ModeloAsignadoA;

import views.VistaInsercionActualizar;

public class ControladorInsercionActualizar implements ActionListener {

	private ModeloProyecto modeloP;
	private ModeloCientifico modeloC;
	private ModeloAsignadoA modeloA;

	private VistaInsercionActualizar vista;
	private int opcion;
	private boolean insercion;

	// Atributos de cliente necesarios
	private String id;
	private String info1;
	private String info2;

	public ControladorInsercionActualizar(ModeloProyecto modP, ModeloCientifico modC, ModeloAsignadoA modA, VistaInsercionActualizar vis) {
		this.modeloP = modP;
		this.modeloC = modC;
		this.modeloA = modA;

		this.vista = vis;

		this.vista.buttonInserir.addActionListener(this);
	}

	public void iniciarVista(int opcion, boolean insercion) {
		this.opcion = opcion;
		this.insercion = insercion;
		vista.setInfo(opcion, insercion);
		if(insercion) {
			if (opcion == 1) {
				vista.setTitle("Inserir proyecto");
			} else if (opcion == 1) {
				vista.setTitle("Inserir cientifico");
			} else if (opcion == 1) {
				vista.setTitle("Inserir asignacion");
			}
		}
		else {
			if (opcion == 1) {
				vista.setTitle("Actualizar proyecto");
			} else if (opcion == 1) {
				vista.setTitle("Actualizar cientifico");
			} else if (opcion == 1) {
				vista.setTitle("Actualizar asignacion");
			}
		}

		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vista.buttonInserir) {
			// Si los campos no están vacios
			if (!"".equals(vista.tfId.getText()) & !"".equals(vista.tfInfo1.getText())) {

				id = vista.tfId.getText();
				info1 = vista.tfInfo1.getText();
				info2 = vista.tfInfo2.getText();

				if(insercion) {
					if (opcion == 1 && !"".equals(vista.tfInfo2.getText())) {
						modeloP.inserirProyecto(id, info1, Integer.parseInt(info2));
					} else if (opcion == 2) {
						modeloC.inserirCientifico(id, info1);
					} else if (opcion == 3 && !"".equals(vista.tfInfo2.getText())) {
						modeloA.inserirAsignadoA(id, info1, info2);
					}	
				}
				else {
					if (opcion == 1) {
						modeloP.actualizarProyecto(id, info1, Integer.parseInt(info2));
					} else if (opcion == 2) {
						modeloC.actualizarCientifico(id, info1);
					} else if (opcion == 3) {
						modeloA.actualizarAsignadoA(id, info1, info2);
					}
				}
				
				vista.limpiarTextFields();
				vista.dispose();
			}
		}
	}
}
