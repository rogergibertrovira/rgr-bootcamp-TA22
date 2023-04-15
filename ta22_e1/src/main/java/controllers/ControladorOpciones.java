package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import views.VistaOpciones;

public class ControladorOpciones implements ActionListener {
	private VistaOpciones vista;
	private ControladorConsulta controladorConsulta;
	private ControladorInsercion controladorInsercion;
	private ControladorBorrar controladorBorrar;
	private ControladorActualizar controladorActualizar;

	public ControladorOpciones(VistaOpciones vis, ControladorConsulta contConsulta,
			ControladorInsercion contInsercion, ControladorActualizar contActualizar, ControladorBorrar contBorrar) {

		this.vista = vis;

		// Controladores
		this.controladorConsulta = contConsulta;
		this.controladorInsercion = contInsercion;
		this.controladorActualizar = contActualizar;
		this.controladorBorrar = contBorrar;

		// Vistas
		this.vista.buttonConsulta.addActionListener(this);
		this.vista.buttonInsercion.addActionListener(this);
		this.vista.buttonBorrar.addActionListener(this);
		this.vista.buttonActualizar.addActionListener(this);
	}

	public void iniciarVista() {
		vista.setTitle("Seleccionar opción");
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		// Consulta
		if (evt.getSource() == vista.buttonConsulta) {
			controladorConsulta.iniciarVista();
		}
		// Inserción
		else if (evt.getSource() == vista.buttonInsercion) {
			controladorInsercion.iniciarVista();
		}
		// Actualizar
		else if (evt.getSource() == vista.buttonActualizar) {
			controladorActualizar.iniciarVista();
		}
		// Borrar
		else if (evt.getSource() == vista.buttonBorrar) {
			controladorBorrar.iniciarVista();
		}
	}
}
