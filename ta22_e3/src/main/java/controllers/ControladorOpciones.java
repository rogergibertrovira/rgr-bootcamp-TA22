package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaOpciones;

public class ControladorOpciones implements ActionListener {
	private VistaOpciones vista;

	// Controladores
	private ControladorConsulta controladorConsulta;
	private ControladorBorrar controladorBorrar;
	private ControladorInsercionActualizar controladorInsercionActualizar;

	public ControladorOpciones(VistaOpciones vis, ControladorConsulta contConsulta, ControladorBorrar contBorrar,
			ControladorInsercionActualizar contInsercionActualizar) {

		// Vista
		this.vista = vis;

		// Controladores
		this.controladorConsulta = contConsulta;
		this.controladorBorrar = contBorrar;
		this.controladorInsercionActualizar = contInsercionActualizar;

		// Botones proyecto
		this.vista.buttonConsultaP.addActionListener(this);
		this.vista.buttonInsercionP.addActionListener(this);
		this.vista.buttonBorrarP.addActionListener(this);
		this.vista.buttonActualizarP.addActionListener(this);

		// Botones cientifico
		this.vista.buttonConsultaC.addActionListener(this);
		this.vista.buttonInsercionC.addActionListener(this);
		this.vista.buttonBorrarC.addActionListener(this);
		this.vista.buttonActualizarC.addActionListener(this);

		// Botones asignadoA
		this.vista.buttonConsultaA.addActionListener(this);
		this.vista.buttonInsercionA.addActionListener(this);
		this.vista.buttonBorrarA.addActionListener(this);
		this.vista.buttonActualizarA.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Seleccionar opción");
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		// Consulta cliente
		if (evt.getSource() == vista.buttonConsultaP) {
			controladorConsulta.iniciarVista(1);
		}
		// Inserción cliente
		else if (evt.getSource() == vista.buttonInsercionP) {
			controladorInsercionActualizar.iniciarVista(1, true);
		}
		// Actualizar cliente
		else if (evt.getSource() == vista.buttonActualizarP) {
			controladorInsercionActualizar.iniciarVista(1, false);
		}
		// Borrar cliente
		else if (evt.getSource() == vista.buttonBorrarP) {
			controladorBorrar.iniciarVista(1);
		}
		// Consulta video
		else if (evt.getSource() == vista.buttonConsultaC) {
			controladorConsulta.iniciarVista(2);
		}
		// Inserción video
		else if (evt.getSource() == vista.buttonInsercionC) {
			controladorInsercionActualizar.iniciarVista(2, true);
		}
		// Actualizar video
		else if (evt.getSource() == vista.buttonActualizarC) {
			controladorInsercionActualizar.iniciarVista(2, false);
		}
		// Borrar video
		else if (evt.getSource() == vista.buttonBorrarC) {
			controladorBorrar.iniciarVista(2);
		}
		// Consulta asignadoA
		else if (evt.getSource() == vista.buttonConsultaA) {
			controladorConsulta.iniciarVista(3);
		}
		// Inserción asignadoA
		else if (evt.getSource() == vista.buttonInsercionA) {
			controladorInsercionActualizar.iniciarVista(3, true);
		}
		// Actualizar asignadoA
		else if (evt.getSource() == vista.buttonActualizarA) {
			controladorInsercionActualizar.iniciarVista(3, false);
		}
		// Borrar asignadoA
		else if (evt.getSource() == vista.buttonBorrarA) {
			controladorBorrar.iniciarVista(3);
		}
	}
}
